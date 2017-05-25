package com.company;

public class Main {

    public static void main(String[] args) {
        //Created a user account with params
	    Account trentonsAccount = new Account("00000", 0.0, "Trenton", "foobar@fizzmail.com", "000-000-0000");

	    trentonsAccount.withdraw(100.00);
	    trentonsAccount.deposit(200.00);
        System.out.println(trentonsAccount.getCustomerName());
        trentonsAccount.withdraw(100.00);

    }
}
