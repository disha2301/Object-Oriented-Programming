package com.gevernova.keywords.librarysystem;

class Book {
    // static variable shared across all books
    static String libraryName = "SRM University";

    // final variable to ensure ISBN cant be changed once assigned
    final String isbn;

    // instance variables
    String title;
    String author;

    // constructor using this keyword
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
