package myproject.beaninitialization.beans;

public class HelloBean {

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
		System.out.println("init() - Method");
		name = "Sami";
		message = "Good Afternoon";
	}
	
	public void destroy() {
		System.out.println("destroy() - Method");
		name = "";
		message = "";
	}
	public String sayHello() {
		return "Hello "+name+", "+message+"!";
	}
}
