package com.airtripe.studentmanagement.util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner SCANNER = new Scanner(System.in);

    // Utility methods for input
    public static String readString(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        while (!SCANNER.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            SCANNER.next();
        }
        int value = SCANNER.nextInt();
        SCANNER.nextLine(); // consume newline
        return value;
    }

    // Demonstrates all primitive data types + typecasting + variable scope
    public static void demoDataTypes() {
        System.out.println("=== Data Types Demo ===");

        byte b = 10;
        short s = 300;
        int i = 10000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 99.99;
        char c = 'A';
        boolean flag = true;

        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("boolean flag = " + flag);

        // Typecasting
        long widened = i;          // implicit widening
        int narrowed = (int) d;    // explicit narrowing

        System.out.println("Implicit cast int->long: " + widened);
        System.out.println("Explicit cast double->int: " + narrowed);

        // Static vs instance example
        class Counter {
            static int staticCounter = 0;
            int instanceCounter = 0;

            void increment() {
                staticCounter++;
                instanceCounter++;
            }
        }

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c1.increment();
        c2.increment();

        System.out.println("Static counter (shared): " + Counter.staticCounter);
        System.out.println("Instance counter c1: " + c1.instanceCounter);
        System.out.println("Instance counter c2: " + c2.instanceCounter);

        // Variable scope example
        {
            int blockVar = 123;
            System.out.println("Block variable inside scope: " + blockVar);
        }
        System.out.println("=== End of Data Types Demo ===");
    }
}
