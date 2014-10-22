package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="post", schema="forum")
public class Post implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
	@SequenceGenerator(name = "post_seq", sequenceName = "forum.post_seq")
	@Column(name="post_id",unique = true, nullable = false)
	private Long postId;
	
	@ManyToOne
	@JoinColumn(name="post_category")
	private PostCategory category;
	
	@Column(name="post_title")
	private String title;
	
	@Column(name="post_message")
	private String message;
	
	@Column(name="post_created_date")
	private Date postedDate;
	
	@Column(name = "posted_by")
	private String postedBy;
	
	public Post(){}
	
	
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}


	public PostCategory getCategory() {
		return category;
	}


	public void setCategory(PostCategory category) {
		this.category = category;
	}


	public String getPostedBy() {
		return postedBy;
	}


	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
