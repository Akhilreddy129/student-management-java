package com.airtripe.studentmanagement.entity;

// Compile-time polymorphism
class Calculator {

    // Method overloading
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
}

// Runtime polymorphism
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Compile-time
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(3.5, 4.5));
        System.out.println(calc.add(1, 2, 3));

        // Runtime – dynamic dispatch
        Shape shape;

        shape = new Circle();
        shape.draw(); // Circle

        shape = new Square();
        shape.draw(); // Square
    }
}
