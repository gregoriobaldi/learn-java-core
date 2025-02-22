package com.nbicocchi.exercises.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n) {
        long[] fibonacci;
        if (n == 1) {
            fibonacci = new long[]{1};
        } else if (n == 2) {
            fibonacci = new long[]{1, 1};
        } else {
            fibonacci = new long[n];
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }
}
