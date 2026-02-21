
package org.example;
public class Driver
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(5); //5 to keep it easy and simple

        Rectangle Rectangle = new Rectangle(4, 5); // trying to keep it easy to do mental math to check
        Square Square = new Square(4);

        RightTriangle Triangle = new RightTriangle(3, 4); //the most know kind of triangle makes it for easy checking
        IsoscelesRightTriangle Basic = new IsoscelesRightTriangle(3);

        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Sides on the square: " + Square.numberOfSides());
        System.out.println("Perimeter of the square: " + Rectangle.getPerimeter());
        System.out.println("Area of the Right triangle: " + Triangle.getArea());
        System.out.println("Isosceles Triangle Perimeter: " + Basic.getPerimeter());
    }
}