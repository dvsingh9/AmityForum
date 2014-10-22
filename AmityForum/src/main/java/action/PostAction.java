package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import persistence.dao.PostDAO;
import persistence.dao.PostCategoryDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entities.Post;
import entities.PostCategory;

public class PostAction extends ActionSupport implements ModelDriven<Post>, SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Post post;
	List<PostCategory> categories;
	
	Map sessionMap;
	PostDAO postDAO = new PostDAO(); 
	PostCategoryDAO categoryDAO = new PostCategoryDAO();
	
	@Action(value="showPostPage",
		    results={@Result(name="success",location="/jsp/postPage.jsp"),
		    		@Result(name="failure",location="/jsp/error.jsp")}
	)
	public String showPostPage(){
		categories = categoryDAO.getAll();
		return SUCCESS;
	}
	
	
	
	@Action(value="addPost",
		    results={@Result(name="success",location="/jsp/postPage.jsp"),
		    		@Result(name="failure",location="/jsp/error.jsp")}
	)
	public String addPost(){
		System.out.println(post.getMessage());
		try {
			post.setPostedDate(new Date());
			post.setPostedBy("Danveer Singh from New Delhi");
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

	public List<PostCategory> getCategories() {
		return categories;
	}



	public void setCategories(List<PostCategory> categories) {
		this.categories = categories;
	}



	public void setSession(Map sessionMap) {
		this.sessionMap = sessionMap;
		
	}

}
