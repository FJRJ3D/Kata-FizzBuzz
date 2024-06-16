package com.fizzbuzz;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


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
}
