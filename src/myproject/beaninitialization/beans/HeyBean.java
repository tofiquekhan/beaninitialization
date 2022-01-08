package myproject.beaninitialization.beans;

public class HeyBean {

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
	
	public void init() {
		System.out.println("Init Method in HeyBean");
		name = "Tofique Ahmed Khan";
		message = "Good Work";
	}
	
	public void destory() {
		System.out.println("destroy() - Method Hey Bean");
		name = "";
		message = "";
	}
	
	public String sayHi() {
		return "Hey "+name+", "+message;
		
	}
}
