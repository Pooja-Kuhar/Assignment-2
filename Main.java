package ASSIGNMENT2;

//Abstract class Shape
abstract class Shape {
 // Abstract method draw
 abstract void draw();
}

//Subclass Circle
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Subclass Rectangle
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Main class to demonstrate dynamic method dispatch
public class Main {
 public static void main(String[] args) {
     // Creating Shape references for Circle and Rectangle
     Shape shape1 = new Circle();
     Shape shape2 = new Rectangle();

     // Calling the draw method
     shape1.draw(); // Calls Circle's draw method
     shape2.draw(); // Calls Rectangle's draw method
 }
}
