package service.BOImpl;

import java.io.Serializable;

import model.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistence.dao.PostDAO;
import service.BO.PostBO;

@Service("postBO")
public class PostBOImpl implements PostBO{

	@Autowired
	private PostDAO postDAO;
	
	public PostBOImpl(){}
	
	public Serializable addPost(Post post) {
		return postDAO.save(post);
	}


	public Post getPost(Long id) {
		return postDAO.get(id);
	}

	public Post loadPost(Long id) {
		return postDAO.load(id);
	}

	   
	// getter setter
	public PostDAO getPostDAO() {
		return postDAO;
	}

	public void setPostDAO(PostDAO postDAO) {
		this.postDAO = postDAO;
	}

	
	
}
