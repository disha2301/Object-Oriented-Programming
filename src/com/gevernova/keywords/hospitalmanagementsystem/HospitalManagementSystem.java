package com.gevernova.keywords.hospitalmanagementsystem;

// Main class to test Patient records
class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Aarav", 45, "Fever");
        Patient p2 = new Patient(102, "Meera", 30, "Fracture");

        // Using instanceof before displaying
        if (p1 instanceof Patient) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Patient) {
            p2.displayDetails();
        }

        System.out.println();

        // Display total patients using static method
        Patient.getTotalPatients();
    }
}