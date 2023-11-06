package com.tw.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 class RectangleTest {

    @Test
    void testCalculateRectangleArea() {
        Float result = new Rectangle().calculateArea(2.0f, 3.0f);
        assertEquals(6.0f, result);
    }

    @Test
    void testCalculateRectangleAreaNegativeInput() {
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea(-2.0f, 3.0f));
    }

    @Test
    void testCalculateRectangleAreaNullInput() {
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea(null, null));
    }

}
