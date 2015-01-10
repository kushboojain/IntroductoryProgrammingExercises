package com.tw.twu.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by khusbooj on 10/01/15.
 */
public class PrimeFactorExercises {
    public static void main(String args[]) throws IOException {

        int n = 0;
        n = ReadUserInput();
        ArrayList<Integer> primeFactors = primeFactors(n);
        printFactors(primeFactors);
        
    }

    private static void printFactors(ArrayList<Integer> primeFactors) {
        for(int i=0;i<primeFactors.size(); i++) {
            System.out.print(primeFactors.get(i));
            if(i != primeFactors.size()-1)
                System.out.print(",");
        }

    }

    private static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                factors.add(i);
            }
        }
        return factors;
    }

    private static int ReadUserInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value for n");
        return Integer.parseInt(br.readLine());
    }
}
