package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void testSquare() {
        Square square = new Square(5);
        assertEquals(25.0, square.getArea());
        assertEquals(20.0, square.getPerimeter());
        assertEquals(4, square.numberOfSides());
    }
}