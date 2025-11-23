-->Encapsulation
Encapsulation is an OOP principle that binds data and methods into a single unit while restricting direct access to object internals. This is achieved using access modifiers like private, protected, and public.
In the "EncapsulationDemo.java" example, the class BankAccount hides its balance variable using private access. It provides public methods (deposit(), withdraw(), getBalance()) for controlled access. This ensures data protection and prevents unauthorized or unsafe modifications.
Encapsulation promotes data integrity, security, and cleaner code architecture.

-->Inheritance
Inheritance is the mechanism by which one class acquires properties and behaviors of another class. It promotes code reusability and establishes a natural hierarchical relationship.
In InheritanceDemo.java, the class Dog extends the class Animal, inheriting its fields and methods. The Dog class overrides the sound() method to provide specialized behavior. This demonstrates:

1.Single inheritance
2.Method overriding
3.Reuse of parent-class features
Inheritance forms the foundation for polymorphism and abstraction.

-->Polymorphism
Polymorphism means “many forms” and allows actions to behave differently based on the context.
Java supports two types:

1. Compile-Time Polymorphism (Method Overloading)

Same method name, different parameters.
Example from PolymorphismDemo.java:
add(int a, int b)
add(double a, double b)
add(int a, int b, int c)

2. Runtime Polymorphism (Method Overriding + Dynamic Dispatch)

Parent class reference pointing to a child class object.
Example: Shape s = new Circle();
s.draw(); // Calls Circle's draw()

Abstraction

Abstraction hides complex implementation details and shows only essential behavior.

Java achieves abstraction through:

-->Abstract classes
Interfaces (with default methods from Java 8)
In AbstractionDemo.java:
1.The abstract class Vehicle defines the abstract method start()
2.The interface Drivable defines accelerate() and a default method brake()
3.The class Car implements Drivable and extends Vehicle, providing concrete implementations
Abstraction simplifies complex systems and enhances modularity.
