package com.tw.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 class RectangleTest {

    @Test
    void testCalculateRectangleAreaNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2.0f, 3.0f));
    }

    @Test
    void testCalculateRectangleAreaNullInput() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(null, null));
    }
     @Test
     void testCalculateRectangleArea() {
         Rectangle rectangle = new Rectangle(2.0f, 3.0f);
         assertEquals(6.0f, rectangle.area());
     }

}
