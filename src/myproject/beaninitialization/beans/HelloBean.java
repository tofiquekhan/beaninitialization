package myproject.beaninitialization.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	/*
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
	*/
	
	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Initializing through afterPropertiesSet() Method"); name
	 * = "Imran"; message = "Good Evening"; }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("destroy() method"); }
	 */
	
	@PostConstruct
	public void initializeBean() {
		System.out.println("Initialization through @PostConstruct Method");
		name = "Sameer";
		message = "Good Night";
				
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("Bean Deinstatiation throught @PreDestory");
		
	}
	
	public String sayHello() {
		return "Hello "+name+", "+message+"!";
	}
}
