package com.gevernova.keywords.hospitalmanagementsystem;

class Patient {
    // Static variable shared across all patients
    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0; // Static counter for patients

    // Final variable for unique patient ID
    final int patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Constructor using 'this' to resolve ambiguity
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients whenever a new one is created
    }

    // Method to display patient details
    void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    // Static method to get total patients
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

