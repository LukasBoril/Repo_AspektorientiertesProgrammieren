package edu.spring.dreieck.xml.lifecycleevents;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dreieck implements InitializingBean, DisposableBean{
	private List<Punkt> punkte;

	public List<Punkt> getPunkte() {
		return punkte;
	}

	public void setPunkte(List<Punkt> punkte) {
		this.punkte = punkte;
	}

	@Override
	public String toString() {
		return "Dreieck [punkte=" + punkte + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
	
	public void mydestroy() throws Exception {
		System.out.println("mydestroy");
	}
	
	public void init() {
		System.out.println("init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	
}
