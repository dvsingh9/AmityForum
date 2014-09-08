package service.BO;

import model.Post;

public interface PostBO {

	public String addPost();
	public Post getPost(Long id);
	public Post loadPost(Long id);
}
