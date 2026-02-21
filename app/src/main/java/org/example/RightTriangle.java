package org.example;

public class RightTriangle extends Shape implements Polygon {
    double base;
    double height;
    RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() { return 0.5 * base * height; }  //Formula
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height); //Formula
    }
    public int numberOfSides() { return 3; }
}
