package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50.0, rectangle.getArea());
        assertEquals(30.0, rectangle.getPerimeter());
        assertEquals(4, rectangle.numberOfSides());
    }
}