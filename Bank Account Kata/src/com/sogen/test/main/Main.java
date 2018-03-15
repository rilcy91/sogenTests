package com.sogen.test.main;

import com.sogen.test.models.Account;
import com.sogen.test.models.Client;
import com.sogen.test.models.Operation;

public class Main {

	public static void main(String[] args) {
		// Création du client
		Client cli = new Client(1, "Doe", "John", "123 rue de la defense 75001 Paris", "0123456789");
		
		// Création d'un compte client
		Account acc = new Account(1, 0);
		
		// US1 : I want to make a deposit in my account
		Operation opeDeposit = new Operation(1, 10, "deposit 10");
		acc.getListOperations().add(opeDeposit);
		Operation opeDeposit2 = new Operation(2, 50, "deposit 50");
		acc.getListOperations().add(opeDeposit2);
		
		// US2 : I want to make a withdrawal from my account
		Operation opewithdrawal = new Operation(3, -10, "withdrawal 10");
		acc.getListOperations().add(opewithdrawal);
		Operation opewithdrawal2 = new Operation(4, -10, "withdrawal 10");
		acc.getListOperations().add(opewithdrawal2);
		Operation opewithdrawal3 = new Operation(5, -10, "withdrawal 10");
		acc.getListOperations().add(opewithdrawal3);

		// Calcul de la balance
		acc.getBalance();
		
		// Ajout du compte au client
		cli.getListAccount().add(acc);
		
		for (Account a : cli.getListAccount()) {
			System.out.println(a.toString());
		}
	}

}
