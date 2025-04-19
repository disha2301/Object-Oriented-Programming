package com.gevernova.constructors.modifiers.Employee;
class EmployeeRecord{
    public static void main(String[] args){
        // object creation
        Employee obj1 = new Employee(80,"CSE",50000);
        obj1.setSalary(75000);
        System.out.println("Updated salary is "+obj1.getSalary());

        Manager obj2 = new Manager(94, "Finance", 52000);
                obj2.showManagerInfo();
    }
}
