package edu.spring.dreieck.xml.awareinterfaces;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Dreieck implements BeanNameAware, ApplicationContextAware {
	private ApplicationContext applicationContext;
    private String  beanName;
	private List<Punkt> punkte;

	public List<Punkt> getPunkte() {
		return punkte;
	}

	public void setPunkte(List<Punkt> punkte) {
		this.punkte = punkte;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}


	@Override
	public String toString() {
		return "Dreieck [punkte=" + punkte + ", applicationContext=" + applicationContext + ", beanName=" + beanName
				+ "]";
	}
	
}
