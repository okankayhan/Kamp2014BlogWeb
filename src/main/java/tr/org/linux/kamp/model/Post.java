package tr.org.linux.kamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSTS")
public abstract class Post {

	private String id;
	private String title;
	private String content;

	public Post(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
