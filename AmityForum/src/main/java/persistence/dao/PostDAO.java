package persistence.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import entities.Post;
import entities.PostCategory;

public class PostDAO extends GenericHibernateDAO<Post, Serializable>{  
	public PostDAO(){
		super();
	}
	
	@SuppressWarnings("unchecked")
	public List<Post> searchByCategory(PostCategory category) throws Exception{
		Transaction tx = null;
		List<Post> list = new  ArrayList<Post>();
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Post.class);
			crit.add(Restrictions.eq("category", category));
			list = crit.list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
		
	}
}
