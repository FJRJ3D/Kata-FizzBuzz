package com.fizzbuzz;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_divisibleByThree() {
        boolean result = fizzBuzz.divisibleByThree(6);
        assertTrue(result);
    }

    @Test
    public void test_divisibleByFive() {
        boolean result = fizzBuzz.divisibleByFive(10);
        assertTrue(result);
    }

    @Test
    public void test_divisibleByThreeAndFive() {
        boolean result = fizzBuzz.divisibleByThreeAndFive(15);
        assertTrue(result);
    }

    @Test
    public void test_numberHasThree() {
        boolean result = fizzBuzz.numberHasThree(32);
        assertTrue(result);
    }

    @Test
    public void test_numberHasFive() {
        boolean result = fizzBuzz.numberHasFive(15);
        assertTrue(result);
    }

    @Test
    public void test_booleanFizz() {
        boolean result = fizzBuzz.booleanFizz(13);
        assertTrue(result);
    }

    @Test
    public void test_booleanBuzz() {
        boolean result = fizzBuzz.booleanBuzz(20);
        assertTrue(result);
    }

    @Test
    public void test_booleanFizzBuzz() {
        boolean result = fizzBuzz.booleanFizzBuzz(35);
        assertTrue(result);
    }

    @Test
    public void test_methodFizzBuzz() {

        ArrayList<String> result = fizzBuzz.methodFizzBuzz();
        ArrayList<String> expected = new ArrayList<>();

        for (int index = 1; 100 >= index; index++) {
            if (fizzBuzz.booleanFizzBuzz(index)) {
                expected.add("FizzBuzz");
            } else if (fizzBuzz.booleanBuzz(index)) {
                expected.add("Buzz");
            } else if (fizzBuzz.booleanFizz(index)) {
                expected.add("Fizz");
            } else {
                expected.add(String.valueOf(index));
            }
        }
        System.out.println(expected);
        System.out.println(result);

        assertEquals(expected, result);

    }
}
