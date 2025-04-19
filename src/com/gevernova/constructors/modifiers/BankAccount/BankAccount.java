package com.gevernova.constructors.modifiers.BankAccount;
public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // constructor
    BankAccount(String accNo, String holder, double initialBalance) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = initialBalance;
    }

    // public getter method for private balance
    public double getBalance(){
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }