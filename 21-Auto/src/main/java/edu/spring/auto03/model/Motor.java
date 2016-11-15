package edu.spring.auto03.model;

public class Motor {
	private Oel oel;

	public Oel getOel() {
		return oel;
	}

	public void setOel(Oel oel) {
		this.oel = oel;
	}

	@Override
	public String toString() {
		return "Motor [oel=" + oel + "]";
	}
	

}
