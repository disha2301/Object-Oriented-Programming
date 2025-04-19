package com.gevernova.constructors.modifiers.BookLibrarySystem;
// subclass to demonstrate access modifiers

class EBook extends Book{

    // constructor
    EBook(String ISBN, String title, String author){
        super(ISBN, title, author);
    }

    // accessing the public and protected members
    public void displayDetails(){
        System.out.println("E-Book ISBN: " + ISBN);       // public
        System.out.println("E-Book Title: " + title);     // protected
        // author is private and cannot be accessed directly
    }
}
