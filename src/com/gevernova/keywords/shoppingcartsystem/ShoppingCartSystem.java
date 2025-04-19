package com.gevernova.keywords.shoppingcartsystem;


// Main class to test the system
class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(1001, "Wireless Mouse", 799.0, 2);
        Product p2 = new Product(1002, "Keyboard", 1299.0, 1);

        // Validate instance before processing
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

        System.out.println();

        // Update discount using static method
        Product.updateDiscount(15.0);

        System.out.println("\nAfter updating discount:\n");

        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayDetails();
        }
    }
}