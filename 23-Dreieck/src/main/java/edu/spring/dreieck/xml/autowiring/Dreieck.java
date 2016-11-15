package edu.spring.dreieck.xml.autowiring;


public class Dreieck {
	private Punkt punktA;
	private Punkt punktB;
	private Punkt punktC;
	public Punkt getPunktA() {
		return punktA;
	}
	public void setPunktA(Punkt punktA) {
		this.punktA = punktA;
	}
	public Punkt getPunktB() {
		return punktB;
	}
	public void setPunktB(Punkt punktB) {
		this.punktB = punktB;
	}
	public Punkt getPunktC() {
		return punktC;
	}
	public void setPunktC(Punkt punktC) {
		this.punktC = punktC;
	}
	@Override
	public String toString() {
		return "Dreieck [punktA=" + punktA + ", punktB=" + punktB + ", punktC=" + punktC + "]";
	}


}
