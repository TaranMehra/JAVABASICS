// Defining an Interface for Shape
interface Shape {
    // Variables in interfaces are implicitly public, static, and final
    String TYPE = "Geometric Shape"; // Constant variable in an interface
    
    // Abstract method - by default, public and abstract
    double calculateArea();
}

// Another Interface for 3D Shapes
interface ThreeDimensional {
    double calculateVolume(); // Abstract method to calculate volume
}

// Implementing Interfaces and Achieving Multiple Inheritance
class Cube implements Shape, ThreeDimensional {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    // Implementing the calculateArea method from Shape
    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    // Implementing the calculateVolume method from ThreeDimensional
    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}

// Abstract Class for Shapes with Color Property
abstract class ColoredShape {
    protected String color;

    public ColoredShape(String color) {
        this.color = color;
    }

    // Abstract method
    abstract void displayColor();

    // Non-abstract method
    public void setColor(String color) {
        this.color = color;
    }
}

// Class that extends the abstract class and implements the Shape interface
class ColoredSquare extends ColoredShape implements Shape {
    private double side;

    public ColoredSquare(double side, String color) {
        super(color);
        this.side = side;
    }

    // Implementing calculateArea method from Shape interface
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Implementing the abstract method from ColoredShape
    @Override
    void displayColor() {
        System.out.println("Color of the square: " + color);
    }
}

// Main Class to Test the Program
public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface variables are constants and can be accessed directly using the interface name
        System.out.println("Shape type: " + Shape.TYPE);

        // Creating a Cube instance
        Cube cube = new Cube(3);
        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());

        // Creating a ColoredSquare instance
        ColoredSquare square = new ColoredSquare(4, "Blue");
        System.out.println("Square area: " + square.calculateArea());
        square.displayColor(); // Display color from abstract class method
    }
}
