package com.jenkinsspringapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MathTest {
    @Test
    @DisplayName("[TEST]: Absolute value")
    void abs() {
        int number = -2;
        int results = Math.abs(number);
        assertEquals(88, results);
    }

    @Test
    @DisplayName("[TEST]: Maximum of two numbers")
    void max() {
        int number1 = 256;
        int number2 = 20;
        int max = Math.max(number1,number2);
        assertEquals(number1,max);
    }

    @Test
    @DisplayName("[TEST]: Product of two numbers")
    void product() {
        int number1 = 5;
        int number2 = 4;
        int expected = number1*number2;
        int max = Math.product(number1,number2);
        assertEquals(expected,max);
    }
}