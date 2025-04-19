package com.gevernova.constructors.modifiers.UniversityManagementSystem;
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Student object
        Student obj = new Student(80, "Disha", 9.7);
        obj.displayDetails();

        // Update CGPA using setter
        obj.setCGPA(9.8);
        System.out.println("Updated CGPA: " + obj.getCGPA());

        System.out.println();

        // Create PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(94, "Ahad", 9.9);
        pgStudent.displayDetails();
        pgStudent.showName(); // Accessing protected name
    }
}