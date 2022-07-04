package org.example;

import java.util.Scanner;

public class LinearPrograms {
    public void exercise_1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();
        System.out.println();

        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);

        System.out.println();
    }

    public void exercise_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();
        System.out.println();

        double z = (b + Math.abs(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("z = " + z);

        System.out.println();
    }

    public void exercise_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value y: ");
        double y = scanner.nextDouble();
        System.out.println();

        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("z = " + z);

        System.out.println();
    }

    public void exercise_4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value R(nnn:ddd): ");
        double R = scanner.nextDouble();
        System.out.println("Value R = " + R);

        int wholePart = (int) R;
        double fractionalPart = (Math.floor((R - wholePart) * 1000) / 1000.0) * 1000;
        double doubleWholePart = wholePart;
        double formattedValue = fractionalPart + (doubleWholePart / 1000);
        System.out.println("Formatted value = " + formattedValue);

        System.out.println();
    }

    public void exercise_5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value T: ");
        int T = scanner.nextInt();

        int seconds = T - (T / 60 * 60);
        int minutes = T / 60 - (T / 3600 * 60);
        int hours = T / 3600;
        System.out.println("HH" + hours + " MM" + minutes + " SS" + seconds);

        System.out.println();
    }

    public void exercise_6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value y: ");
        double y = scanner.nextDouble();

        if(x <= 4 && x >= -4 && y <= 4 && y >= -3) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println();
    }
}
