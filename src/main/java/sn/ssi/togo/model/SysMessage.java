package sn.ssi.togo.model;
import java.io.Serializable;

public class SysMessage implements Serializable {

	private String subject;
	private String attachFile;
	private String content;
	private String usermail;

	public SysMessage(String subject, String attachFile, String content,
			String usermail) {
		super();
		this.subject = subject;
		this.attachFile = attachFile;
		this.content = content;
		this.usermail = usermail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAttachFile() {
		return attachFile;
	}

	public void setAttachFile(String attachFile) {
		this.attachFile = attachFile;
	}

	public SysMessage() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

}
