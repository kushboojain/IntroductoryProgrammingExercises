package com.tw.twu.exercises;

/**
 * Created by khusbooj on 10/01/15.
 */
public class FizzBuzzExercise {
    public static void main(String args[]) {
        FizzBuzz();
    }

    private static void FizzBuzz() {

        for(int number=1; number<=100;number++) {
            if((DivisibleBy3(number) + DivisibleBy5(number)).equals(""))
                System.out.println(number);
            else
                System.out.println(DivisibleBy3(number) + DivisibleBy5(number));

        }
    }

    private static String DivisibleBy3(int number) {
        if(number%3==0)
            return "Fizz";
        return "";
    }private static String DivisibleBy5(int number) {
        if(number%5==0)
            return "Buzz";
            return "";
    }
}
