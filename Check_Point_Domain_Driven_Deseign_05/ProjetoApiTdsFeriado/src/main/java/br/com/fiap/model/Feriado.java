package br.com.fiap.model;

public class Feriado {

	private String date;
	private String name;
	private String type;

	public Feriado() {
		super();
	}

	public Feriado(String date, String name, String type) {
		super();
		this.date = date;
		this.name = name;
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Feriado [date=" + date + ", name=" + name + ", type=" + type + "]";
	}

}
