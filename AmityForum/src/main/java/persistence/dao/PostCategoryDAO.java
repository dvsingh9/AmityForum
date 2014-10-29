package persistence.dao;

import java.io.Serializable;

import entities.PostCategory;

public class PostCategoryDAO extends
		GenericHibernateDAO<PostCategory, Serializable> {
	public PostCategoryDAO() {
		super();
	}

}
