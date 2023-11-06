package com.tw.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    void shouldThrowExceptionIfNegativeInputs() {
        assertThrows(IllegalArgumentException.class, () -> Rectangle.createRectangle(-2.0f, 3.0f));
    }

    @Test
    void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(2.0f, 3.0f);
        assertEquals(6.0f, rectangle.area());
    }

    @Test
    void shouldReturnPerimeterOfRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(2.0f, 3.0f);
        assertEquals(10.0f, rectangle.perimeter());
    }

}
