package action;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import persistence.dao.PostDAO;
import persistence.dao.postCategoryDAO;

import com.opensymphony.xwork2.ActionSupport;

import entities.Post;
import entities.PostCategory;

public class PostListingAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1862460163361127501L;
	
	private String categoryId;
	
	PostDAO postDAO = new PostDAO(); 
	postCategoryDAO categoryDAO = new postCategoryDAO();
	private List<Post> posts;
	private List<PostCategory> categories;
	
	public static Comparator<Post> COMPARE_BY_DATE = new Comparator<Post>() {
        public int compare(Post one, Post other) {
            return one.getPostId().compareTo(other.getPostId());
        }
    };
	
	
	@Action(value="showPostListingPage",
		    results={@Result(name="success",location="/jsp/postListingPage.jsp"),
		    		@Result(name="error",location="/jsp/postListingPage.jsp")}
	)
	public String showPostListingPage(){
		categories =  categoryDAO.getAll();
		posts = postDAO.getAll();
		Collections.reverse(posts);
		return SUCCESS;
	}
	@Action(value="searchPostForCategory",
		    results={@Result(name="success",location="/jsp/postListingPage.jsp"),
		    		@Result(name="error",location="showPostListingPage", type="chain")}
	)
	public String searchPostForCategory(){
		try {
			posts = postDAO.searchByCategory(categoryDAO.load(Long.parseLong(categoryId)));
			Collections.reverse(posts);
		} catch (Exception e) {
			addActionError("Could not load data from database, Cause :" +e.getMessage());
			return ERROR;
		}
		
		return SUCCESS;
	}
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<PostCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<PostCategory> categories) {
		this.categories = categories;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
