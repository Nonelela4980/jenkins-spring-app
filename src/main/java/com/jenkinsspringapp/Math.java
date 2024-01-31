package com.jenkinsspringapp;
public class Math {

    /**
     * Returns the absolute value of a number.
     * @param number The integer input.
     * @return The absolute value of number.
     */
    public static int abs(int number){
        return number<0? (number*(-1)):number;
    }
    /**
     * Returns the maximum of two numbers.
     * @param number1 The first integer input.
     * @param number2 The second integer input.
     * @return The maximum of number1 and number2.
     */
    public static int max(int number1,int number2){
        if (number1 >= number2)
            return number1;
        return number2;
    }
    /**
     * Calculates and returns the product of two numbers.
     * This method takes two integers as input parameters and multiplies them to compute the product.
     * @param number1 The first integer input.
     * @param number2 The second integer input.
     * @return The product of number1 and number2.
     */
    public static int product(int number1,int number2){
        return number1*number2;
    }
}
