package edu.spring.dreieck.xml.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.dreieck.xml.collection.Dreieck;


public class MainAppDreieckCollection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/beans02Collection.xml");
		Dreieck obj = (Dreieck) context.getBean("dreieck");
		System.out.println(obj.toString());
	    ((AbstractApplicationContext) context).close();
	}
}
