package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post_category", schema="forum")
public class PostCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1551315389622947501L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",unique = true, nullable = false)
	private Long id;
	@Column(name="name")
	private String name;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
