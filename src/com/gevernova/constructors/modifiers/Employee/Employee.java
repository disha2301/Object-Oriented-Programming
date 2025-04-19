package com.gevernova.constructors.modifiers.Employee;
// base class
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // constructor to initialize employee object
    Employee(int employeeID, String department,double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // public method to get salary
    public double getSalary(){
        return salary;
    }

    // public method to set salary
    public void setSalary(double salary){
        if(salary > 0) {
            this.salary = salary;
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}