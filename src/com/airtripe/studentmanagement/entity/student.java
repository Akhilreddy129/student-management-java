package com.airtripe.studentmanagement.entity;

public class student extends Person implements Identifiable {

    // Private = encapsulation
    private String studentId;
    private String department;

    // Static counter to auto-generate IDs
    private static int nextId = 1;

    // Default constructor
    public student() {
        super();
        this.studentId = "S" + nextId++;
    }

    // Parameterized constructor
    public student(String name, int age, String email, String department) {
        super(name, age, email); // calls Person(String, int, String)
        this.studentId = "S" + nextId++;
        this.department = department;
    }

    // Copy constructor
    public student(student other) {
        super(other); // calls Person(Person)
        this.studentId = other.studentId;
        this.department = other.department;
    }

    // Getters/Setters
    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Implementation of Identifiable interface
    @Override
    public String getId() {
        return studentId;
    }

    // Polymorphism: overriding abstract method from Person
    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() +
                " | ID: " + studentId +
                " | Dept: " + department +
                " | Email: " + getEmail());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", id='" + studentId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
