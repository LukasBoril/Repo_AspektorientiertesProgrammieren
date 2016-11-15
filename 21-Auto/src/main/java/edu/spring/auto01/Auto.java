package edu.spring.auto01;

public class Auto {
	
	public void fahren () {
		System.out.println("Auto fährt");
		Benzin benzin = new Benzin();
		benzin.verbrauchen();
	}
}
