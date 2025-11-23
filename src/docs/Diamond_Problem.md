-->Diamond Problem in Java
The Diamond Problem occurs when a class inherits from two parent classes that contain methods with the same signature. Java avoids this by not allowing multiple inheritance of classes.
However, it allows multiple inheritance through interfaces.

In DiamondProblemDemo.java, interfaces A and B both define a show() default method. Class C implements both, causing ambiguity. Java requires explicit resolution: A.super.show();
This demonstrates how Java provides flexibility via interfaces while preventing ambiguity that comes with multiple inheritance.
