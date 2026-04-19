package Tasks_one;
class Animal {
    String name;

    // Method (will be overridden)
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Inheritance
class Dog extends Animal {

    // Polymorphism (Method Overriding)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        // Object creation
        Animal a1 = new Animal();
        Animal d1 = new Dog();   // Upcasting
        Animal c1 = new Cat();

        // Method calling
        a1.sound();
        d1.sound();   // Dog method will run
        c1.sound();   // Cat method will run
    }
}

    
