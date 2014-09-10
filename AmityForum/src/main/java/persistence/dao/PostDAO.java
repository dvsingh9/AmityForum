package persistence.dao;

import java.io.Serializable;

import model.Post;

public class PostDAO extends GenericHibernateDAO<Post, Serializable>{  
	public PostDAO(){
		super();
	}
}
