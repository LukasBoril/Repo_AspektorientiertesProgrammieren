package edu.spring.auto03.model;

import java.util.List;

import edu.spring.auto03.model.fuel.Benzin;
import edu.spring.auto03.model.fuel.Kraftstoff;

public class Auto {
	
	private String name;
	private Motor motor;
	private Kraftstoff kraftstoff;
	private List <Reifen> reifen;

	public void fahren (Benzin benzin){
		System.out.println("Auto fährt");
		benzin.verbrauchen();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Kraftstoff getKraftstoff() {
		return kraftstoff;
	}

	public void setKraftstoff(Kraftstoff kraftstoff) {
		this.kraftstoff = kraftstoff;
	}

	public List<Reifen> getReifen() {
		return reifen;
	}

	public void setReifen(List<Reifen> reifen) {
		this.reifen = reifen;
	}

	@Override
	public String toString() {
		return "Auto [name=" + name + ", motor=" + motor + ", kraftstoff=" + kraftstoff + ", reifen=" + reifen + "]";
	}
	
}
