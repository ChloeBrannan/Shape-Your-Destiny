package org.example;

public class App {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 5);
    Square square = new Square(4);
    RightTriangle triangle = new RightTriangle(3, 4);
    IsoscelesRightTriangle basic = new IsoscelesRightTriangle(3);

    System.out.println("Area of the circle: " + circle.getArea()); //Keeping the driver code just now in app
    System.out.println("Sides on the square: " + square.numberOfSides());
    System.out.println("Perimeter of the square: " + rectangle.getPerimeter());
    System.out.println("Area of the Right triangle: " + triangle.getArea());
    System.out.println("Isosceles Triangle Perimeter: " + basic.getPerimeter());
  }
}