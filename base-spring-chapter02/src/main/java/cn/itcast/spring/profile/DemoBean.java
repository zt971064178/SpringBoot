package cn.itcast.spring.profile;

public class DemoBean {

	private String content ;
	
	public DemoBean(String content) {
		super() ;
		this.setContent(content) ;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
