package com.gevernova.keywords.librarysystem;

// Main class to test Book class functionality
class LibrarySystem {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Display library name using static method
        Book.displayLibraryName();
        System.out.println();

        // Check if object is instance of Book and display details
        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        System.out.println();

        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}
