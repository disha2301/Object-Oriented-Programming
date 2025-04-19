package com.gevernova.constructors.modifiers.BookLibrarySystem;
// base class
class Book{
    public String ISBN;
    protected String title;
    private String author;

    // constructor to initialize book obj
    Book(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // public getter for author
    public String getAuthor(){
        return author;
    }

    // public setter for author
    public void setAuthor(String author){
        this.author = author;
    }

    //Display book details
    public void printDetails(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
