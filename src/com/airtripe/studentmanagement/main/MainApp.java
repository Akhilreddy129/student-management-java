package com.airtripe.studentmanagement.main;

import com.airtripe.studentmanagement.entity.GraduateStudent;
import com.airtripe.studentmanagement.entity.Person;
import com.airtripe.studentmanagement.entity.student;
import com.airtripe.studentmanagement.service.StudentService;
import com.airtripe.studentmanagement.util.InputUtil;

public class MainApp {

    public static void main(String[] args) {

        // Show data types, typecasting, scope demo once
        InputUtil.demoDataTypes();

        StudentService studentService = new StudentService();
        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Name");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Search Student by Name");
            System.out.println("7. Demo Polymorphism (Person -> Student -> GraduateStudent)");
            System.out.println("0. Exit");

            choice = InputUtil.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addStudentMenu(studentService);
                case 2 -> studentService.viewAllStudents();
                case 3 -> updateStudentMenu(studentService);
                case 4 -> deleteStudentMenu(studentService);
                case 5 -> searchByIdMenu(studentService);
                case 6 -> searchByNameMenu(studentService);
                case 7 -> polymorphismDemo();
                case 0 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }

    private static void addStudentMenu(StudentService service) {
        String name = InputUtil.readString("Enter name: ");
        int age = InputUtil.readInt("Enter age: ");
        String email = InputUtil.readString("Enter email: ");
        String dept = InputUtil.readString("Enter department: ");

        service.addStudent(name, age, email, dept);
    }

    private static void updateStudentMenu(StudentService service) {
        String id = InputUtil.readString("Enter Student ID to update: ");
        String newName = InputUtil.readString("Enter new name: ");

        if (service.updateStudentName(id, newName)) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudentMenu(StudentService service) {
        String id = InputUtil.readString("Enter Student ID to delete: ");
        if (service.deleteStudent(id)) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchByIdMenu(StudentService service) {
        String id = InputUtil.readString("Enter Student ID to search: ");
        student s = service.findById(id);
        if (s != null) {
            s.displayInfo();
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchByNameMenu(StudentService service) {
        String name = InputUtil.readString("Enter Student name to search: ");
        student s = service.findByName(name);
        if (s != null) {
            s.displayInfo();
        } else {
            System.out.println("Student not found.");
        }
    }

    // Polymorphism demo: base class reference pointing to subclass objects
    private static void polymorphismDemo() {
        System.out.println("\n=== Polymorphism Demo ===");

        Person p1 = new student("Alice", 20, "alice@example.com", "CSE");
        Person p2 = new GraduateStudent("Bob", 24, "bob@example.com",
                                        "CSE", "AI", "Deep Learning Thesis");

        // Dynamic method dispatch: which displayInfo() is called depends on actual object
        p1.displayInfo();  // calls Student.displayInfo()
        p2.displayInfo();  // calls GraduateStudent.displayInfo()
    }
}
