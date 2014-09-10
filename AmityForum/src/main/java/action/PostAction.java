package action;

import model.Post;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import persistence.dao.PostDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends ActionSupport implements ModelDriven<Post>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Post post = new Post();
	PostDAO postDAO = new PostDAO();   
	
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
		System.out.println(post.getMessage());
		try {
			postDAO.save(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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

}
