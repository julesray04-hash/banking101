package edu.se;

public class Account {

    // keeps track of the next account number
    private static long nextNumber = 1000000000000000L;

    // all the info for one account
    private long accountNumber;
    private String type;
    private String holderName;
    private double balance;

    // makes a new account with the given info
    public Account(String type, String holderName, double balance) {

        // gives each account its own number
        this.accountNumber = nextNumber++;

        // stores the info passed into the constructor
        this.type = type;
        this.holderName = holderName;
        this.balance = balance;
    }
    // getter methods to get the account info
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // setter methods to change account info
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}