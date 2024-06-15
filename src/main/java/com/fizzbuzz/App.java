package com.fizzbuzz;

public class App {

    public static void main( String[] args ) {

        for (int index =1; 100>=index; index++){
            int number1 = (index/10)%10;
            int number2 = index%10;

            if (index % 3 == 0 && index % 5 == 0 || index%3 ==0 && number1 ==5 ||index%3 ==0 &&  number2 ==5 || index%5 ==0 && number1==3||index%5 ==0 &&number2==3||number1==3&&number2==5||number1==5&&number2==3){
                System.out.println("FizzBuzz");
            }else if (number1 ==3 || index%3 == 0||number2==3) {
                System.out.println("Fizz");
            }else if (number1==5 || index%5 ==0||number2==5) {
                System.out.println("Buzz");
            }else {
                System.out.println(index);
            }
        }
    }
}
