package edu.spring.helloworld.annotation.xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.helloworld.annotation.xml.scan.HelloWorldPrinter;


public class MainAppHelloWorldXMLAnnotation {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldPrinter helloWorldPrinter = (HelloWorldPrinter) context.getBean("helloWorldPrinter");

		helloWorldPrinter.print();

		context.registerShutdownHook();
		context.close();
		context.close();
		
	}
}


