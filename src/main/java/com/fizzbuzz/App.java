package com.fizzbuzz;

public class App {

    public static void main( String[] args ) {
        for(int index =1; 100>=index; index++) {
            if (index%3 == 0){
                if (index%5 == 0){
                    System.out.println("FizzBuzz");
                }else {
                    System.out.println("Fizz");
                }
            }else if (index%5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(index);
            }
        }
    }
}
