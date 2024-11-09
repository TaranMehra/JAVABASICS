package inheritance;
class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;  // Superclass reference

        // Assigning a Dog object to the Animal reference
        myAnimal = new Dog();
        myAnimal.speak();  // Outputs: Bark

        // Assigning a Cat object to the Animal reference
        myAnimal = new Cat();
        myAnimal.speak();  // Outputs: Meow
    }
}
