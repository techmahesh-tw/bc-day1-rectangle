package com.tw.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {

    @Test
    void shouldThrowExceptionIfNegativeInputs() {
        assertThrows(IllegalArgumentException.class, () -> Rectangle.createSquare(-2.0f));
    }

    @Test
    void shouldReturnAreaOfSquare() {
        Rectangle square = Rectangle.createSquare(2.0f);
        assertEquals(4.0f, square.area());
    }

    @Test
    void shouldReturnPerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(2.0f);
        assertEquals(8.0f, square.perimeter());
    }

}
