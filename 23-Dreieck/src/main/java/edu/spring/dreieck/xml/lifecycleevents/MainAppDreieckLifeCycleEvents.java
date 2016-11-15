package edu.spring.dreieck.xml.lifecycleevents;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAppDreieckLifeCycleEvents {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("xml/beans06LifeCycleEvents.xml");
		Dreieck obj = (Dreieck) context.getBean("dreieck");
		System.out.println(obj.toString());
		context.registerShutdownHook();
		context.close();
	}
}
