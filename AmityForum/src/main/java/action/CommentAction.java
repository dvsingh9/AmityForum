package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import persistence.dao.CommentDAO;
import persistence.dao.PostDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entities.Comment;
import entities.Post;
import entities.PostCategory;
import entities.User;

public class CommentAction extends ActionSupport implements ModelDriven<Post>,
		SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String postId;
	private Post post;
	private Comment comment;
	List<PostCategory> categories;
	private String actionError;
	private String actionMsg;

	Map session;
	PostDAO postDAO = new PostDAO();
	CommentDAO commentDAO = new CommentDAO();

	/**
	 * This is used for adding the comments on post
	 * @return String value i.e success or failure
	 */
	@Action(value = "addComment", results = {
			@Result(name = "success", location = "commentPage", type = "chain"),
			@Result(name = "failure", location = "commentPage", type = "chain") })
	public String addComment() {
		User userInfo = (User) session.get(Messages
				.getString("CommentAction.1")); //$NON-NLS-1$
		try {
			comment.setPostId(post);
			comment.setCommentedOn(new Date());
			comment.setUser(userInfo.getName());
			commentDAO.save(comment);

			actionMsg = Messages.getString("CommentAction.2"); //$NON-NLS-1$
			this.postId = comment.getPostId().getPostId().toString();
		} catch (Exception e) {
			actionError = Messages.getString("CommentAction.3") + e.getMessage(); //$NON-NLS-1$
		}
		return SUCCESS;
	}

	@Action(value = "commentPage", results = {
			@Result(name = "success", location = "/jsp/commentPage.jsp"),
			@Result(name = "failure", location = "/jsp/postListingPage.jsp") })
	public String commentPage() {
		addActionError(actionError);
		addActionMessage(actionMsg);
		try {
			post = postDAO.get(Long.parseLong(postId));
			post.setComments(commentDAO.getCommentsOfPost(post));
		} catch (Exception e) {
			addActionError(Messages.getString("CommentAction.0") + e.getMessage()); //$NON-NLS-1$
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

	public Comment getComment() {
		return comment;
	}

	// getter setter
	public Post getModel() {
		return post;
	}

	public Post getPost() {
		return post;
	}

	public String getPostId() {
		return postId;
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

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public void setSession(Map session) {
		this.session = session;

	}

}
