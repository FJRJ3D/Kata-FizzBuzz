package com.fizzbuzz;

public class App {

    public static void main( String[] args ) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int index =1; 100>=index; index++) {
            if (fizzBuzz.booleanFizzBuzz(index)){
                System.out.println("FizzBuzz");
            }else if (fizzBuzz.booleanBuzz(index)){
                System.out.println("Buzz");
            }else if (fizzBuzz.booleanFizz(index)) {
                System.out.println("Fizz");
            }else {
                System.out.println(index);
            }

        }

    }

}
