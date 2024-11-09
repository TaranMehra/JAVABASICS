abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    abstract void sound();

    // Concrete (non-abstract) method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof");
    }
}

class Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
        dog.sleep();
    }
}
