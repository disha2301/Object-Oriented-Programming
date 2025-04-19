package com.gevernova.keywords.bankaccount;

// base class
class BankAccount {
    // static variable which is shared across all
    static String bankName = "Yes Bank";

    // static counter to keep track of total accounts
    static int totalAccounts = 0;

    // final variable to ensure account number can not be changed
    final int accountNumber;

    // instance variable for account holder
    String accountHolderName;

    // Constructor using this keyword
    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // static method to display total number of accounts
    static void getTotalAccounts(){
        System.out.println("Total accounts created "+totalAccounts);
    }

    // method to display account details
    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}
