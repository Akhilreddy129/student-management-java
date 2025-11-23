package com.airtripe.studentmanagement.entity;

// Interface with default method (Java 8+ feature) and multiple implementations later
interface Identifiable {
    String getId();

    default void printIdLabel() {
        System.out.println("ID: " + getId());
    }
}

// Abstract class: base for Student and GraduateStudent
public abstract class Person {
    // Encapsulation: private fields
    private String name;
    private int age;

    // Protected: visible to subclasses, even in other packages
    protected String email;

    // Static variable: shared among all Person objects
    private static int personCount = 0;

    // Default constructor
    public Person() {
        personCount++;
    }

    // Parameterized constructor
    public Person(String name, int age, String email) {
        this(); // calls default constructor (constructor chaining)
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Copy constructor
    public Person(Person other) {
        this(other.name, other.age, other.email);
    }

    // Getters and setters (encapsulation: controlled access)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Static method to show static member usage
    public static int getPersonCount() {
        return personCount;
    }

    // Abstract method for polymorphism / abstraction
    public abstract void displayInfo();
}
