package com.airtripe.studentmanagement.entity;

interface A {
    default void show() { System.out.println("A"); }
}

interface B {
    default void show() { System.out.println("B"); }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show(); // resolving ambiguity
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();  // Calls A.show()
    }
}
