package com.sogen.test.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int id ;
	private float balance;
	private List<Operation> listOperations;
	
	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
		this.listOperations = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		String result = "-----------------------------\nHistory account n° : " + this.id + "\n";
		result += "Balance : " + this.balance + "\n";
		
		result += "Operations :" + "\n";
		for (Operation op : listOperations) {
			result += op.toString();
		}
		
		return result;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBalance() {
		for (int i = 0; i < this.listOperations.size(); i++) {
			this.balance += this.listOperations.get(i).getAmount();
		}
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public List<Operation> getListOperations() {
		return listOperations;
	}

	public void setListOperations(List<Operation> listOperations) {
		this.listOperations = listOperations;
	}
}
