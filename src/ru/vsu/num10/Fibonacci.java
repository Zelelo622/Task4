package ru.vsu.num10;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // N-th number of a sequence in which each element is equal to the sum of the previous two.
        int n = readInteger();
        printSumOfEvenFibonacciNumbers(calculateSumOfEvenNumber(n));
    }

    private static int calculateSumOfEvenNumber(int n) {
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

    private static void printSumOfEvenFibonacciNumbers(int evenSum) {
        System.out.println("Displaying the sum of even Fibonacci numbers: " + evenSum + "");
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N-th number of a sequence = ");
        return scanner.nextInt();
    }
}
