package com.company;

/**
 * Created by Boanerges on 5/25/17.
 */
public class VipUser {
    //Declarations
    private String name;
    private double creditLimit;
    private String emailAddress;

    //VIP Contructor
    public VipUser() {
        this("Default name", 50000.00, "default@email.com");
    }
    public VipUser(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipUser(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
