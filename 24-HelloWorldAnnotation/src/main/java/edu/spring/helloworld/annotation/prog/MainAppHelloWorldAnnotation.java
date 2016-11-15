package edu.spring.helloworld.annotation.prog;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.spring.helloworld.annotation.prog.config.SpringConfiguration;
import edu.spring.helloworld.annotation.prog.scan.HelloWorldPrinter;


public class MainAppHelloWorldAnnotation {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		HelloWorldPrinter helloWorldPrinter = (HelloWorldPrinter) context.getBean("helloWorldPrinter");

		helloWorldPrinter.print();
	
		context.registerShutdownHook();
		context.close();
	}
}


