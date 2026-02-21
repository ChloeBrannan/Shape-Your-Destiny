package org.example;

public class Rectangle extends Shape implements Polygon {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * (length + width); }
    public int numberOfSides() { return 4; }
}
//Using the same logic as before but now in it's own class