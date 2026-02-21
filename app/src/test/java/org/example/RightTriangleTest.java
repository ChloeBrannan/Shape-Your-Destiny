package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RightTriangleTest {
    @Test
    public void testRightTriangle() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6.0, triangle.getArea());
        assertEquals(12.0, triangle.getPerimeter());
        assertEquals(3, triangle.numberOfSides());
    }
}