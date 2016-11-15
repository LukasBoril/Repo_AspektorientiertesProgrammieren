package edu.spring.dreieck.xml.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAppDreieck01Basics {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/beans01BasicsInner.xml");
		Dreieck obj = (Dreieck) context.getBean("dreieck");
		System.out.println(obj.toString());
	    ((AbstractApplicationContext) context).close();
	}
}
