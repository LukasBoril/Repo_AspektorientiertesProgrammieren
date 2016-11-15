package edu.spring.auto03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.auto03.model.Auto;



public class MainAuto03 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
		Auto obj = (Auto) context.getBean("A3");
		System.out.println(obj.toString());
		((AbstractApplicationContext) context).close();
	}

}
