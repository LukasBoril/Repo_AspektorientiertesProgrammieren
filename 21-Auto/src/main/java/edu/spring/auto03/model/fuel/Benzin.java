package edu.spring.auto03.model.fuel;

public class Benzin implements Kraftstoff{
	public void verbrauchen () {
		System.out.println("Benzin wird verbraucht");
	}

	@Override
	public String toString() {
		return "Benzin";
	}
}
