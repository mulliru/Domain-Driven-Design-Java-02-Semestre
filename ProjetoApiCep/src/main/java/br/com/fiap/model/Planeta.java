package br.com.fiap.model;

public class Planeta {

	private String name;
	private String rotation_period;
	private String orbital_period;
	private String diameter;
	private String climate;
	
	//Construtor vazio
	public Planeta() {
		super();
	}
	//Construtor cheio

	public Planeta(String name, String rotation_period, String orbital_period, String diameter, String climate) {
		super();
		this.name = name;
		this.rotation_period = rotation_period;
		this.orbital_period = orbital_period;
		this.diameter = diameter;
		this.climate = climate;
	}
	//Getters e Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotation_period() {
		return rotation_period;
	}

	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}

	public String getOrbital_period() {
		return orbital_period;
	}

	public void setOrbital_period(String orbital_period) {
		this.orbital_period = orbital_period;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}
	//convert to string

	@Override
	public String toString() {
		return "Planeta [name=" + name + ", rotation_period=" + rotation_period + ", orbital_period=" + orbital_period
				+ ", diameter=" + diameter + ", climate=" + climate + "]";
	}
	
	
}
