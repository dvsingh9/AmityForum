package persistence.daoImpl;

import java.io.Serializable;

import model.Post;

import org.springframework.stereotype.Repository;

import persistence.dao.PostDAO;

@Repository("postDAO")
public class PostDAOImpl extends GenericHibernateDAO<Post, Serializable>
		implements PostDAO {  
	public PostDAOImpl(){
		super();
	}
	
}
