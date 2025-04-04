package com.gevernova.constructors.modifiers.UniversityManagementSystem;
class Student {
    public int rollNumber;          // Public - accessible anywhere
    protected String name;          // Protected - accessible in subclass
    private double CGPA;            // Private - accessible only inside this class

    // Constructor to initialize the object
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}