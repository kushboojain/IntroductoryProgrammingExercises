package com.tw.twu.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by khusbooj on 09/01/15.
 */
public class TriangleExercisesProblem4RightTriangle {
    public static void main(String args[]) throws IOException {
        int n = ReadUserInput();
        rightTriangle(n);

    }

    private static void rightTriangle(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int ReadUserInput() throws IOException {
        System.out.print("Enter a value for n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }
}
