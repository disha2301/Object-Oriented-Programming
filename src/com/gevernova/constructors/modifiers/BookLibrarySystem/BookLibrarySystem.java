package com.gevernova.constructors.modifiers.BookLibrarySystem;
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("123-456789", "Java Basics", "John Smith");
        book1.printDetails();

        // Updating author name using setter
        book1.setAuthor("Alice Johnson");
        System.out.println("Updated Author: " + book1.getAuthor());

        System.out.println();

        // Creating an EBook object
        EBook ebook1 = new EBook("789-123456", "Advanced Java", "Emily Davis");
        ebook1.displayDetails();
    }
}