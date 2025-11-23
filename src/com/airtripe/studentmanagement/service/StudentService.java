package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    // Dynamic data structure
    private List<student> students = new ArrayList<>();

    // Overloaded methods (compile-time polymorphism)

    // 1) Add existing Student object
    public void addStudent(student student) {
        students.add(student);
        System.out.println("Student added: " + student.getStudentId());
    }

    // 2) Add using details
    public student addStudent(String name, int age, String email, String department) {
        student s = new student(name, age, email, department);
        students.add(s);
        System.out.println("Student added: " + s.getStudentId());
        return s;
    }

    // CRUD: Read
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (student s : students) {
            s.displayInfo();
        }
    }

    // Update student name by ID
    public boolean updateStudentName(String studentId, String newName) {
        student s = findById(studentId);
        if (s != null) {
            s.setName(newName);
            return true;
        }
        return false;
    }

    // Delete student by ID
    public boolean deleteStudent(String studentId) {
        return students.removeIf(s -> s.getStudentId().equals(studentId));
    }

    // Search by ID
    public student findById(String studentId) {
        for (student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    // Search by Name
    public student findByName(String name) {
        for (student s : students) {
            if (s.getName() != null && s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}
