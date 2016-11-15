package edu.spring.dreieck.xml.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAppDreieckInheritance {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/beans04Inheritance.xml");

		Dreieck obj = (Dreieck) context.getBean("dreieck");
		System.out.println(obj.toString());
		
		Dreieck2 obj2 = (Dreieck2) context.getBean("dreieck2");
		System.out.println(obj2.toString());
		
	    ((AbstractApplicationContext) context).close();

	}
}
