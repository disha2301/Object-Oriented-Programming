package com.gevernova.keywords.employeemanagementsystem;

// Main class to test the program
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aarav", 101, "Software Developer");
        Employee emp2 = new Employee("Nisha", 102, "HR Manager");

        // Check if objects are instances of Employee before displaying details
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

        System.out.println();

        // Display total employees using static method
        Employee.displayTotalEmployees();
    }
}