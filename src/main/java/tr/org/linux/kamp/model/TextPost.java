package tr.org.linux.kamp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_POST")
public class TextPost extends Post{

	public TextPost(String title, String content) {
		super(title, content);
	}

}
