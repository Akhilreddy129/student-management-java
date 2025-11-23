package com.airtripe.studentmanagement.entity;

public class Enrollment {

    private String enrollmentId;
    private student student;
    private Course course;

    private static int nextEnrollmentNumber = 1;

    // Constructor 1: full
    public Enrollment(String enrollmentId, student student, Course course) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
    }

    // Constructor 2: generate ID automatically (constructor chaining)
    public Enrollment(student student, Course course) {
        this("E" + nextEnrollmentNumber++, student, course);
    }

    // Copy constructor
    public Enrollment(Enrollment other) {
        this(other.enrollmentId, other.student, other.course);
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id='" + enrollmentId + '\'' +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
