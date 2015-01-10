package com.tw.twu.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by khusbooj on 09/01/15.
 */
public class DiamondExercisesProblem3DiamondWithName {
    public static void main(String args[]) throws IOException {

        diamond(ReadUserInput(), ReadUserName());

    }

    private static String ReadUserName() throws IOException {
        System.out.print("Enter name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();

    }
    private static int ReadUserInput() throws IOException {
        System.out.print("Enter a value for n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }


    private static void diamond(int n, String name) {
        upperTriangle(n);
        System.out.println(name);
        lowerTriangle(n);
    }

    private static void lowerTriangle(int n) {
        for(int i=1; i<=n-1; i++) {
            printSpace(i);
            printAsterisk(n-i);
            System.out.println();
        }

    }

    private static void printAsterisk(int n) {
        for(int j=1; j<=2*n-1; j++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int line) {
        for (int j = 1; j <= line; j++) {
            System.out.print(" ");
        }
    }

    private static void upperTriangle(int n) {
        for(int i=1; i<n; i++) {
            printSpace(n-i);
            printAsterisk(i);
            System.out.println();
        }
    }

}
