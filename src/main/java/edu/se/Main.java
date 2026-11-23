package edu.se;

public class Main {

    public static void main(String[] args) {

        // makes the service that stores our accounts
        AccountService service = new AccountService();

        // makes a new checking account
        Account account = new Account("checking", "Julie", 100.00);

        // adds the account to the service
        service.createAccount(account);

        // prints the account info
        System.out.println("Account created:");
        System.out.println("Number: " + account.getAccountNumber());
        System.out.println("Type: " + account.getType());
        System.out.println("Name: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());

        // changes the account name and balance
        service.updateAccount(account.getAccountNumber(), "Julie Ray", 250.00);

        // checks if the changes worked
        System.out.println("\nAccount updated:");
        System.out.println("Name: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());

        // removes the account
        service.deleteAccount(account.getAccountNumber());

        System.out.println("\nAccount deleted.");
    }
}