package com.compan.num10;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n = readN();
        outputFibonacci(gettingTheSumOfTheNumber(n));
    }

    public static int gettingTheSumOfTheNumber(int n) {
        int fib1 = 1;
        int fib2 = 0;
        int evensum = 0;

        while ((fib1 + fib2) <= n) {
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            if (sum % 2 == 0) {
                evensum += sum;
            }
        }
        return evensum;
    }

    public static void outputFibonacci(int evensum) {
        System.out.println("Displaying the sum of even Fibonacci numbers: "+evensum+"");
    }

    public static int readN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n --> ");
        return scanner.nextInt();
    }
}
