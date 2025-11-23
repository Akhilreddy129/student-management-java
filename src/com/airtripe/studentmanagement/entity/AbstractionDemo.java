package com.airtripe.studentmanagement.entity;

// Abstract class
abstract class Vehicle {
    abstract void start();  // abstract method

    public void stop() {     // concrete method
        System.out.println("Vehicle stopped.");
    }
}

// Interface
interface Drivable {
    void accelerate();

    default void brake() {   // default method (Java 8+)
        System.out.println("Vehicle braking...");
    }
}

class Car extends Vehicle implements Drivable {
    @Override
    void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}
