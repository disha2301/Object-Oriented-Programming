package com.gevernova.keywords.vehicleregistrationsystem;

// Main class to test Vehicle registration
class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("TN10AB1234", "Sahana", "Car");
        Vehicle v2 = new Vehicle("KA05XY9876", "Arjun", "Bike");

        // Use instanceof to check before displaying details
        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }

        System.out.println();

        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }

        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(6000.0);
    }
}
