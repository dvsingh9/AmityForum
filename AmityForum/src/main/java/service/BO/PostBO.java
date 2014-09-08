package service.BO;

import java.io.Serializable;

import model.Post;

public interface PostBO {

	public Serializable addPost(Post post);
	public Post getPost(Long id);
	public Post loadPost(Long id);
}
