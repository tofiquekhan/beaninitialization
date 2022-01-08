package myproject.beaninitialization.beans;

public class WishBean {

	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
//	public void init() {
//		System.out.println("init method wish bean");
//		name = "Mandlik";
//		message="Happy Birthday";
//	}
//	
//	public void destory() {
//		System.out.println("destroy() - Method WishBean");
//		name = "";
//		message = "";
//	}
	
	public String sayWish() {
		return name+", "+message;
		
	}
}
