package com.gevernova.constructors.modifiers.BankAccount;
class BankSystem{
    public static void main(String[] args){
        BankAccount obj = new BankAccount("1234567890", "Anjali", 5000.00);
        obj.displayDetails();

        // Modify balance using public methods
        obj.deposit(1500.00);
        obj.withdraw(1000.00);
        System.out.println("Updated Balance: ₹" + obj.getBalance());

        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("9876543210", "Ravi", 8000.00);
        savings.showAccountInfo();
    }
}