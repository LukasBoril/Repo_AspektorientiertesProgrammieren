package edu.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppHelloWorld {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		((AbstractApplicationContext) context).close();
	}
}


