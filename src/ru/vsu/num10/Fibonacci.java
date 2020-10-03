package ru.vsu.num10;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // N-th number of a sequence in which each element is equal to the sum of the previous two.
        int n = readN();
        outputSumOfEvenFibonacciNumbers(gettingTheSumOfTheNumber(n));
    }

    static int gettingTheSumOfTheNumber(int n) {
        // The first term of the Fibonacci sequence
        int fib1 = 1;
        // Second term of the Fibonacci sequence
        int fib2 = 1;
        // Sum of even members of a sequence
        int evenSum = 0;

        while ((fib1 + fib2) <= n) {
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            if (sum % 2 == 0) {
                evenSum += sum;
            }
        }
        return evenSum;
    }

    static void outputSumOfEvenFibonacciNumbers(int evenSum) {
        System.out.println("Displaying the sum of even Fibonacci numbers: "+evenSum+"");
    }

    static int readN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n = ");
        return scanner.nextInt();
    }
}
