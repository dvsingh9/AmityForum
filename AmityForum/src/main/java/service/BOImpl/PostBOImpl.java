package service.BOImpl;

import model.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import persistence.dao.PostDAO;
import service.BO.PostBO;

@Service("postBO")
public class PostBOImpl implements PostBO{

	@Autowired
	private PostDAO postDAO;
	
	public PostBOImpl(){}
	
	public String addPost() {
		return null;
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
