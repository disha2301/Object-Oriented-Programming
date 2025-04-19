package com.gevernova.keywords.universitystudentmanagement;

// Main class to demonstrate the features
class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aanya", 'A');
        Student s2 = new Student(102, "Rohan", 'B');

        // Check if object is an instance before performing operations
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade('A');
        }

        System.out.println();

        if (s2 instanceof Student) {
            s2.displayDetails();
        }

        System.out.println();

        // Display total number of students
        Student.displayTotalStudents();
    }
}