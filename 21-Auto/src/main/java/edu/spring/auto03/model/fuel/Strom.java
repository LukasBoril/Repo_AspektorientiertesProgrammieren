package edu.spring.auto03.model.fuel;

public class Strom  implements Kraftstoff{
	public void verbrauchen () {
		System.out.println("Strom wird verbraucht");
	}

	@Override
	public String toString() {
		return "Strom";
	}
	
}
