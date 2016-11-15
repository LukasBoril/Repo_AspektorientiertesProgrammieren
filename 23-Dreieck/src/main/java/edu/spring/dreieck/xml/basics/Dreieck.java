package edu.spring.dreieck.xml.basics;


public class Dreieck {
	private Punkt start;

	public Punkt getStart() {
		return start;
	}

	public void setStart(Punkt start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Dreieck [start=" + start + "]";
	}
	
}
