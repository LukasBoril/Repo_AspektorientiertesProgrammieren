package edu.spring.dreieck.xml.inheritance;


public class Dreieck2 extends Dreieck {

	private Punkt punktB;

	public Punkt getPunktB() {
		return punktB;
	}
	public void setPunktB(Punkt punktB) {
		this.punktB = punktB;
	}

	@Override
	public String toString() {
		return "Dreieck2 [punktA=" + punktA + ", punktB=" + punktB  + "]";
	}

}

