package persistence.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import entities.Comment;
import entities.Post;

public class CommentDAO extends GenericHibernateDAO<Comment, Serializable> {
	public CommentDAO() {
		super();
	}

	public List<Comment> getCommentsOfPost(Post post) {
		Transaction tx = null;
		List<Comment> list = new ArrayList<Comment>();
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Comment.class);
			crit.add(Restrictions.eq("postId", post));
			list = crit.list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		return list;
	}  }
