package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesRightTriangleTest {
    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle basic = new IsoscelesRightTriangle(3);
        assertEquals(4.5, basic.getArea());
        assertEquals(3, basic.numberOfSides());
    }
}