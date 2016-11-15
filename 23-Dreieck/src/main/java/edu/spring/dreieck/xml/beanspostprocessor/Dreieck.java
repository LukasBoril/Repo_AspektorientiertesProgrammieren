package edu.spring.dreieck.xml.beanspostprocessor;

import java.util.List;

public class Dreieck {
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
	
}
