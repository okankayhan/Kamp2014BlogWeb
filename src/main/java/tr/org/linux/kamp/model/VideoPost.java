package tr.org.linux.kamp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="VIDEO_POST")
public class VideoPost extends Post {

	private String videoUrl;

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public VideoPost(String title, String content, String videoUrl) {
		super(title, content);
		this.videoUrl = videoUrl;
	}

}
