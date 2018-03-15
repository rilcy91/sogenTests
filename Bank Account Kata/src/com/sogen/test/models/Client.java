package com.sogen.test.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private int id;
	private String name;
	private String firstname;
	private String address;
	private String phone;
	private List<Account> listAccount;
	
	public Client(int id, String name, String firstname, String address, String phone) {
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.address = address;
		this.phone = phone;
		this.listAccount = new ArrayList<>();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Account> getListAccount() {
		return listAccount;
	}

	public void setListAccount(List<Account> listAccount) {
		this.listAccount = listAccount;
	}
}
