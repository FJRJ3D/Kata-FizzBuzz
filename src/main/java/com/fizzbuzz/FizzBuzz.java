package com.fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {

    public boolean divisibleByThree(int number){
        return number%3 == 0;
    }

    public boolean divisibleByFive(int number){
        return number%5 == 0;
    }

    public boolean divisibleByThreeAndFive(int number){
        return divisibleByFive(number) && divisibleByThree(number);
    }

    public boolean numberHasThree(int number){
        int number1 = (number/10)%10;
        int number2 = number%10;

        return number1 == 3 || number2 == 3;
    }

    public boolean numberHasFive(int number){
        int number1 = (number/10)%10;
        int number2 = number%10;

        return number1 == 5 || number2 == 5;
    }

    public boolean booleanFizz(int number){
        return divisibleByThree(number) || numberHasThree(number);
    }

    public boolean booleanBuzz(int number){
        return divisibleByFive(number) || numberHasFive(number);
    }

    public boolean booleanFizzBuzz(int number){
        return booleanFizz(number) && booleanBuzz(number);
    }

    public ArrayList<String> methodFizzBuzz() {

        ArrayList<String> result = new ArrayList<>();
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int index = 1; 100 >= index; index++) {
            if (fizzBuzz.booleanFizzBuzz(index)) {
                result.add("FizzBuzz");
            } else if (fizzBuzz.booleanBuzz(index)) {
                result.add("Buzz");
            } else if (fizzBuzz.booleanFizz(index)) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(index));
            }
        }
        return result;
    }
}
