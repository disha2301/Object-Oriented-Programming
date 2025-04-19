package com.gevernova.constructors.modifiers.Employee;
// subclass demonstrating access to public and protected members
class Manager extends Employee{

    // constructor
    Manager(int id, String dept, double salary){
        super(id, dept, salary);
    }

    // Method to show manager-specific info
    public void showManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);     // public
        System.out.println("Department: " + department);      // protected
        // salary is private and cannot be accessed directly here
    }
}
