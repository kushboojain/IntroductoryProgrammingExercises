package com.tw.twu.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by khusbooj on 09/01/15.
 */
public class TriangleExercisesProblem2HorizontalLine {
    public static void main(String args[]) throws IOException {

        int n = 0;
        n = ReadUserInput();
        printHorizontalLine(n);
    }

    private static int ReadUserInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value for n");
        return Integer.parseInt(br.readLine());
    }

    private static void printHorizontalLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
    }
}
