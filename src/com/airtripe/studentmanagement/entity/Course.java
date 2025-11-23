package com.airtripe.studentmanagement.entity;

public class Course implements Identifiable {

    private String courseId;
    private String courseName;
    private int credits;

    private static int nextCourseNumber = 1;

    // Default constructor
    public Course() {
        this("C" + nextCourseNumber++, "Unnamed Course", 0);
    }

    // Parameterized constructor
    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Copy constructor
    public Course(Course other) {
        this(other.courseId, other.courseName, other.credits);
    }

    @Override
    public String getId() {
        return courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName + " (" + credits + " credits)";
    }
}
