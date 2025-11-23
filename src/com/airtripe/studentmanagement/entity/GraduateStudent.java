package com.airtripe.studentmanagement.entity;

public class GraduateStudent extends student {

    private String specialization;
    private String thesisTitle;

    // Default constructor
    public GraduateStudent() {
        super();
    }

    // Parameterized constructor
    public GraduateStudent(String name, int age, String email,
                           String department, String specialization, String thesisTitle) {
        super(name, age, email, department); // calls Student(String, int, String, String)
        this.specialization = specialization;
        this.thesisTitle = thesisTitle;
    }

    // Copy constructor
    public GraduateStudent(GraduateStudent other) {
        super(other); // Student copy constructor
        this.specialization = other.specialization;
        this.thesisTitle = other.thesisTitle;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    // Polymorphism: overriding displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("Graduate Student: " + getName() +
                " | Spec: " + specialization +
                " | Thesis: " + thesisTitle);
    }
}
