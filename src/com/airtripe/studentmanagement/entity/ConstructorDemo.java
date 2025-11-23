package com.airtripe.studentmanagement.entity;

class Book {
    String title;
    int price;

    // Default constructor
    public Book() {
        this("Unknown Title", 0); // calls parameterized
    }

    // Parameterized constructor
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.price = other.price;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Book b1 = new Book();                       // default
        Book b2 = new Book("Java Basics", 299);     // parameterized
        Book b3 = new Book(b2);                     // copy

        System.out.println(b1.title + " - " + b1.price);
        System.out.println(b2.title + " - " + b2.price);
        System.out.println(b3.title + " - " + b3.price);
    }
}
