package com.sogen.test.models;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Operation {
	private int id;
	private float amount;
	private String label;
	private LocalDateTime date;
	
	public Operation(int id, float amount, String label) {
		this.id = id;
		this.amount = amount;
		this.label = label;
		this.date = LocalDateTime.now(ZoneId.of("Europe/Paris"));
	}
	
	@Override
	public String toString() {
		return "\tId : " + this.id + "\n" +
				"\tDate : " + this.date.toLocalDate() + " " + this.date.toLocalTime() + "\n" +
				"\tAmount : " + this.amount + "\n" +
				"\tLabel : " + this.label + "\n" +
				"\t-------------\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
