package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import persistence.dao.PostCategoryDAO;
import persistence.dao.PostDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entities.Post;
import entities.PostCategory;
import entities.User;

public class PostAction extends ActionSupport implements ModelDriven<Post>,
		SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String actionError;
	private String actionMsg;

	private Post post;
	List<PostCategory> categories;

	Map session;
	PostDAO postDAO = new PostDAO();
	PostCategoryDAO categoryDAO = new PostCategoryDAO();

	@Action(value = "addPost", results = {
			@Result(name = "success", location = "showPostPage", type = "chain"),
			@Result(name = "failure", location = "/jsp/error.jsp") })
	public String addPost() {
		User user = (User) session.get(Messages.getString("PostAction.0")); //$NON-NLS-1$
		if (user != null) {
			try {
				post.setPostedDate(new Date());
				post.setPostedBy(user.getName());
				postDAO.save(post);

				actionMsg = Messages.getString("PostAction.1"); //$NON-NLS-1$
			} catch (Exception e) {
				actionError = Messages.getString("PostAction.2") + e.getMessage(); //$NON-NLS-1$
			}
		} else {
			actionError = Messages.getString("PostAction.3"); //$NON-NLS-1$
		}
		return SUCCESS;
	}

	public String getActionError() {
		return actionError;
	}

	public String getActionMsg() {
		return actionMsg;
	}

	public List<PostCategory> getCategories() {
		return categories;
	}

	// getter setter
	public Post getModel() {
		return post;
	}

	public Post getPost() {
		return post;
	}

	public void setActionError(String actionError) {
		this.actionError = actionError;
	}

	public void setActionMsg(String actionMsg) {
		this.actionMsg = actionMsg;
	}

	public void setCategories(List<PostCategory> categories) {
		this.categories = categories;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setSession(Map session) {
		this.session = session;

	}

	@Action(value = "showPostPage", results = {
			@Result(name = "success", location = "/jsp/postPage.jsp"),
			@Result(name = "failure", location = "/jsp/error.jsp") })
	public String showPostPage() {
		addActionError(actionError);
		addActionMessage(actionMsg);
		categories = categoryDAO.getAll();
		return SUCCESS;
	}

}
