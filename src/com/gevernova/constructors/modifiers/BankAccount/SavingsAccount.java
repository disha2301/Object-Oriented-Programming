package com.gevernova.constructors.modifiers.BankAccount;
class SavingsAccount extends BankAccount{

    //constructor
    SavingsAccount(String accNo, String holder, double initialBalance) {
        super(accNo, holder, initialBalance);
    }

    // Accessing public and protected members
    public void showAccountInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number: " + accountNumber);       // public
        System.out.println("Account Holder: " + accountHolder);       // protected
        // balance is private and cannot be accessed directly
    }
}