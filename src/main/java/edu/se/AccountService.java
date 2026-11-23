package edu.se;

import java.util.HashMap;

public class AccountService {

    // stores all the accounts using their account numbers
    private HashMap<Long, Account> accounts = new HashMap<>();

    // adds a new account to the list
    public void createAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    // finds an account and changes its info
    public void updateAccount(long accountNumber, String holderName, double balance) {

        // gets the account using its number
        Account account = accounts.get(accountNumber);

        // only changes it if the account exists
        if (account != null) {
            account.setHolderName(holderName);
            account.setBalance(balance);
        }
    }

    // removes an account using its number
    public void deleteAccount(long accountNumber) {
        accounts.remove(accountNumber);
    }
}