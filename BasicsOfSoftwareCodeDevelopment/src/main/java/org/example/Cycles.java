package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycles {
    public void exercise_1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
        int value = scanner.nextInt();
        int finalValue = 0;
        if(value > 0) {
            for(int i = 1; i <= value; i++) {
                finalValue += i;
            }
            System.out.println("Final value = " + finalValue);
        }
        else {
            System.out.println("Invalid value");
            System.out.println();
            exercise_1();
        }

        System.out.println();
    }

    public void exercise_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value h: ");
        double h = scanner.nextDouble();

        if(a > b || h > b) {
            System.out.println("Invalid value");
            System.out.println();
            exercise_2();
        }
        else {
            while (a <= b) {
                double x = a;
                if(x > 2) {
                    System.out.println("Value y = " + x);
                }
                else if(x <= 2) {
                    System.out.println("Value y = " + x * (-1));
                }
                a += h;
            }
        }

        System.out.println();
    }

    public void exercise_3() {
        double sumOfSquares = 0;
        for(int i = 0; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        System.out.println("Sum of squares = " + sumOfSquares);

        System.out.println();
    }

    public void exercise_4() {
        long multiplicationOfSquares = 1;
        for(int i = 1; i <= 200; i++) {
            multiplicationOfSquares *= Math.pow(i, 2);
        }
        System.out.println("Multiplication of squares = " + multiplicationOfSquares);

        System.out.println();
    }

    public void exercise_5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter value n: ");
        double n = scanner.nextDouble();

        double sum = 0;
        for(int i = 0; i <= n; i++) {
            double a = Math.abs((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));
            if(a >= e) {
                sum += a;
            }
        }

        System.out.println("Sum = " + sum);

        System.out.println();
    }

    public void exercise_6() {
        for(int i = 0; i < 255; i++) {
            System.out.println(i + " - " + (char)i);
        }
    }

    public void exercise_7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value m: ");
        int m = scanner.nextInt();
        System.out.print("Enter value n: ");
        int n = scanner.nextInt();

        if(m <= 0 || m > n) {
            System.out.println("Invalid value");
            System.out.println();
            exercise_7();
        }
        else {
            for(int i = m; i <= n; i++) {
                System.out.print("Divisors of " + i + ": ");
                for(int k = 1; k <= i; k++) {
                    if(i % k == 0 && k != 1 && k != i) {
                        System.out.print(k + ", ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println();
    }

    public void exercise_8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value b: ");
        int b = scanner.nextInt();

        int[] arr = new int[10];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        System.out.print("The numbers included in both numbers: ");
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.print(b % 10 + ", ");
            b /=10;
        }

        System.out.println();
    }
}
