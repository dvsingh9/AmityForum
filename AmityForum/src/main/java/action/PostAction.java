package action;

import model.Post;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import persistence.dao.PostDAO;
import service.BO.PostBO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends ActionSupport implements ModelDriven<Post>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Post post = new Post();
	  
	@Autowired
	private PostBO postBO;
	
	@Autowired
	private PostDAO postDAO;
	    
	@Action(value="showPostPage",
		    results={@Result(name="success",location="/jsp/postPage.jsp"),
		    		@Result(name="failure",location="/jsp/error.jsp")}
	)
	public String showPostPage(){
		System.out.println("inside show post page method");
		//Post postInfo = postBO.getPost(1l);
		//System.out.println(postInfo.getMessage());
		return SUCCESS;
	}
	
	
	
	@Action(value="addPost",
		    results={@Result(name="success",location="/jsp/postPage.jsp"),
		    		@Result(name="failure",location="/jsp/error.jsp")}
	)
	public String addPost(){
		System.out.println("Add Post");
		System.out.println(post.getMessage());
		return SUCCESS;
	}
	
	
// getter setter
	public Post getModel() {
		return post;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public PostBO getPostBO() {
		return postBO;
	}

	public void setPostBO(PostBO postBO) {
		this.postBO = postBO;
	}



	public PostDAO getPostDAO() {
		return postDAO;
	}

	public void setPostDAO(PostDAO postDAO) {
		this.postDAO = postDAO;
	}

}
