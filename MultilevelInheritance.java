package ASSIGNMENT2;

class Shape {
    private String type;

    // Constructor
    public Shape(String type) {
        this.type = type;
    }

    // Method to get the type of shape
    public String getType() {
        return type;
    }

    // Method to display shape information
    public void displayInfo() {
        System.out.println("Shape type: " + type);
    }
}
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle"); // Calling the constructor of Shape
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the method from Shape
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}
class ColoredCircle extends Circle {
    private String color;

    // Constructor
    public ColoredCircle(double radius, String color) {
        super(radius); // Calling the constructor of Circle
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the method from Circle
        System.out.println("Color: " + color);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create an instance of ColoredCircle
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");

        // Display information about the colored circle
        coloredCircle.displayInfo();
    }
}
