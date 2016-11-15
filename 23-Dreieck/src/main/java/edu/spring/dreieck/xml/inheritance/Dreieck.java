package edu.spring.dreieck.xml.inheritance;


public class Dreieck {
	protected Punkt punktA;

	public Punkt getPunktA() {
		return punktA;
	}
	public void setPunktA(Punkt punktA) {
		this.punktA = punktA;
	}

	@Override
	public String toString() {
		return "Dreieck [punktA=" + punktA  + "]";
	}

}

