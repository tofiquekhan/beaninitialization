package myproject.beaninitialization.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.beaninitialization.beans.HelloBean;
import myproject.beaninitialization.beans.HeyBean;
import myproject.beaninitialization.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/myproject/beaninitialization/resources/applicationContext.xml");
		WishBean wishBean = (WishBean) context.getBean("wishBean");
		System.out.println(wishBean.sayWish());
		
		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		
		HeyBean heyBean = (HeyBean) context.getBean("heyBean");
		System.out.println(heyBean.sayHi());
		context.registerShutdownHook();
	}
}
