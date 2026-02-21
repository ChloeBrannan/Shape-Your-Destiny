package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testCircle() {
        Circle circle = new Circle(10);
        assertEquals(314.159, circle.getArea(), 0.001);
        assertEquals(62.831, circle.getPerimeter(), 0.001);
    }
}