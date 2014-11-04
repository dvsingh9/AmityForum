package action;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import persistence.dao.CommentDAO;
import persistence.dao.PostCategoryDAO;
import persistence.dao.PostDAO;

import com.opensymphony.xwork2.ActionSupport;

import entities.Comment;
import entities.Post;
import entities.PostCategory;

public class PostListingAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1862460163361127501L;

	private String categoryId;

	PostDAO postDAO = new PostDAO();
	PostCategoryDAO categoryDAO = new PostCategoryDAO();
	CommentDAO commentDAO = new CommentDAO();
	private List<Post> posts;
	private List<PostCategory> categories;

	public static Comparator<Post> COMPARE_BY_DATE = new Comparator<Post>() {
		public int compare(Post one, Post other) {
			return one.getPostId().compareTo(other.getPostId());
		}
	};

	public List<PostCategory> getCategories() {
		return categories;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public List<Post> getPosts() {
		return posts;
	}

	@Action(value = "searchPostForCategory", results = {
			@Result(name = "success", location = "/jsp/postListingPage.jsp"),
			@Result(name = "error", location = "showPostListingPage", type = "chain") })
	public String searchPostForCategory() {
		try {
			PostCategory postCategory = new PostCategory();
			postCategory.setId(Long.parseLong(categoryId));
			posts = postDAO.searchByCategory(postCategory);
			Collections.reverse(posts);
			categories = categoryDAO.getAll();
			addActionMessage(posts.size()
					+ Messages.getString("PostListingAction.2")); //$NON-NLS-1$
		} catch (Exception e) {
			addActionError(Messages.getString("PostListingAction.3") //$NON-NLS-1$
					+ e.getMessage());
			return ERROR;
		}

		return SUCCESS;
	}

	public void setCategories(List<PostCategory> categories) {
		this.categories = categories;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Action(value = "showPostListingPage", results = {
			@Result(name = "success", location = "/jsp/postListingPage.jsp"),
			@Result(name = "error", location = "/jsp/postListingPage.jsp") })
	public String showPostListingPage() {
		try {
			categories = categoryDAO.getAll();
			posts = postDAO.getAll();
			Collections.reverse(posts);

			for (Post post : posts) {
				List<Comment> comList = commentDAO.getCommentsOfPost(post);
				post.setComments(comList);
			}
			addActionMessage(posts.size()
					+ Messages.getString("PostListingAction.0")); //$NON-NLS-1$
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(Messages.getString("PostListingAction.1") //$NON-NLS-1$
					+ e.getMessage());
			return ERROR;
		}
		return SUCCESS;
	}
}
