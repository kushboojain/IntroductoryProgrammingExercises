package com.tw.twu.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by khusbooj on 09/01/15.
 */
public class DiamondExercisesProblem1IsoscelesTriangle {
    public static void main(String args[]) throws IOException {
        int n = ReadUserInput();
        isoscelcesTriangle(n);

    }

    private static void isoscelcesTriangle(int n) {
        for(int line=1; line<=n; line++) {
            printSpace(n, line);
            printAsterisk(line);
            System.out.println();
        }
    }

    private static void printSpace(int n, int i) {
        for(int j=n-i; j>=1; j--) {
            System.out.print(" ");
        }
    }

    private static void printAsterisk(int line) {
        for(int j=1; j <= 2*line-1; j++) {
            System.out.print("*");
        }
    }

    private static int ReadUserInput() throws IOException {
        System.out.print("Enter a value for n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

}
