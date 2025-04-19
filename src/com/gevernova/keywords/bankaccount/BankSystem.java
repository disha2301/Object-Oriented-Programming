package com.gevernova.keywords.bankaccount;

// Main class to test the BankAccount class
class BankSystem {
    public static void main(String[] args) {
        // Create account objects
        BankAccount obj1 = new BankAccount("Alice", 1001);
        BankAccount obj2 = new BankAccount("Bob", 1002);

        // Use instanceof before displaying details
        if (obj1 instanceof BankAccount) {
            obj1.displayDetails();
        }

        if (obj2 instanceof BankAccount) {
            obj2.displayDetails();
        }

        // Show total accounts
        BankAccount.getTotalAccounts();
    }
}