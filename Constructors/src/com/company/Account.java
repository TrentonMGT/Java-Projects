package com.company;

/**
 * Created by Boanerges on 5/25/17.
 */
public class Account {
    //Declarations
    private String  accountNumber;
    private double  accountBalance;
    private String  customerName;
    private String  customerAddress;
    private String  customerPhoneNumber;

    //constructor
    public Account(String accountNumber, double accountBalance, String customerName, String customerAddress, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //default constructor
    public Account(){
        this("1212", 1225.00, "Trenton", "efefe@glmail.com", "111-111-1111");
    }

    //deposit method for the account
    public void deposit(double depositAmount){
       this.accountBalance += depositAmount;

        System.out.println("Deposit amount " +depositAmount+ ".  Your current balance is "+ this.accountBalance );
    }

    //Withdraw method for the account
    public void withdraw(double withdrawAmount){
        if (withdrawAmount > 0.0 && withdrawAmount > this.accountBalance)
        {
            System.out.println("Withdrawal amount exceeded account balance");
            return;
        }

        this.accountBalance -= withdrawAmount;

        System.out.println("Withdrawal "+withdrawAmount + " You have have " + this.accountBalance + " remaining");
    }

    //Account Methods of getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
