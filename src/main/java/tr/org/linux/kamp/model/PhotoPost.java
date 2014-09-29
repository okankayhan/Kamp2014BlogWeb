package tr.org.linux.kamp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PHOTO_POST")
public class PhotoPost extends Post {

	public PhotoPost(String title, String content, String photoUrl) {
		super(title, content);
		this.photoUrl = photoUrl;
	}

	private String photoUrl;

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
