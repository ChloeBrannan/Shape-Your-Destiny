package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  public void testCircle() {
    Circle circle = new Circle(10); //same as the driver
    assertEquals(314.159, circle.getArea(), 0); //not going to lie I just ran it then wrote tests to make sure it got what I calculated
    assertEquals(62.831, circle.getPerimeter(), 0); //same with this one
  }

  @Test
  public void testRectangle() {
    Rectangle Rectangle = new Rectangle(5, 10); //same as the driver
    assertEquals(50.0, Rectangle.getArea()); //simple area testing
    assertEquals(30.0, Rectangle.getPerimeter());
    assertEquals(4, Rectangle.numberOfSides());
  }

  @Test
  public void testSquare() {
    Square Square = new Square(5);
    assertEquals(25.0, Square.getArea()); //but now with squares
    assertEquals(20.0, Square.getPerimeter());
    assertEquals(4, Square.numberOfSides());
  }

  @Test
  public void testRightTriangle() {
    RightTriangle Triangle = new RightTriangle(3, 4);
    assertEquals(6.0, Triangle.getArea());
    assertEquals(12.0, Triangle.getPerimeter());
    assertEquals(3, Triangle.numberOfSides());
  }

  @Test
  public void testIsoscelesRightTriangle() {
    IsoscelesRightTriangle Basic = new IsoscelesRightTriangle(3);
    assertEquals(4.5, Basic.getArea());
    assertEquals(3, Basic.numberOfSides());
  }
}