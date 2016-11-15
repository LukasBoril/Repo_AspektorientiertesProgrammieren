package edu.spring.dreieck.xml.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAppDreieckAutowiring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/beans03Autowiring.xml");
		
		Dreieck obj = (Dreieck) context.getBean("dreieck");
		System.out.println(obj.toString());
	    ((AbstractApplicationContext) context).close();
	}
}
