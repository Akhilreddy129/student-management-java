package com.airtripe.studentmanagement.entity;

class Animal {
    String type = "Animal";

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed = "Labrador";

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println("Type: " + d.type);
        System.out.println("Breed: " + d.breed);

        d.sound(); // overridden method
    }
}
