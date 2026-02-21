package org.example;

interface Polygon
{
  int numberOfSides(); //Number of sides used below
}

abstract class Shape
{
  public abstract double getArea();//Not going to lie I would just use area same with perimeter
  public abstract double getPerimeter(); //using as it is stated to use in the doc
}

class Circle extends Shape
{
  double radius; //double to allow for decimals for radius
  Circle(double radius) { this.radius = radius; }
  public double getArea() { return Math.PI * radius * radius; } //basic formula for area to then be used for solving
  public double getPerimeter() { return 2 * Math.PI * radius; } //getting the perimeter using formula provided
}

class Rectangle extends Shape implements Polygon //classes for the shapes used
{
  double length;
  double width;
  Rectangle(double length, double width)
  {
    this.length = length;
    this.width = width;
  }
  public double getArea() { return length * width; }
  public double getPerimeter() { return 2 * (length + width); }
  public int numberOfSides() { return 4; }
}

class RightTriangle extends Shape implements Polygon
{
  double base;
  double height;
  RightTriangle(double base, double height)
  {
    this.base = base;
    this.height = height;
  }
  public double getArea()
  {
    return 0.5 * base * height; //simple math for finding area
  }
  public double getPerimeter()
  {
    return base + height + Math.sqrt(base * base + height * height);
  }
  public int numberOfSides() { return 3; }
}

class Square extends Rectangle
{
  Square(double side) { super(side, side);
  }
}

class IsoscelesRightTriangle extends RightTriangle //class for triangle for more ease but when drawning this later it will suck the amount of classes I have
{
  IsoscelesRightTriangle(double leg) { super(leg, leg);
  }
}

public class App {
  public static void main(String[] args) {
    System.out.println("Shape Loaded."); //End point to show everything was loaded
  }
}