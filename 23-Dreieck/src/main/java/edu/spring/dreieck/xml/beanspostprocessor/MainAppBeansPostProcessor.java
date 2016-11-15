package edu.spring.dreieck.xml.beanspostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAppBeansPostProcessor {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/beans07BeansPostProcessor.xml");
		Dreieck obj = (Dreieck) context.getBean("dreieck");
		System.out.println(obj.toString());
		((AbstractApplicationContext) context).close();
		
	}
}
