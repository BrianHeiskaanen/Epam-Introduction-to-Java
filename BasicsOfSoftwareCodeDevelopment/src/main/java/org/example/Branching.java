package org.example;

import java.util.Scanner;

public class Branching {
    public void exercise_1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter corner 1: ");
        double corner1 = scanner.nextDouble();
        System.out.print("Enter corner 2: ");
        double corner2 = scanner.nextDouble();
        System.out.println();

        if((corner1 + corner2) < 180) {
            if(corner1 == 90 || corner2 == 90 || (180 - (corner1 + corner2)) == 90) {
                System.out.println("The triangle exists. It's rectangular");
            }
            else {
                System.out.println("The triangle exists. It's not rectangular");
            }
        }
        else {
            System.out.println("The triangle doesn't exist.");
        }

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
        System.out.print("Enter value d: ");
        double d = scanner.nextDouble();
        System.out.println();

        System.out.println("Value: " + Math.max(Math.min(a, b), Math.min(c, d)));

        System.out.println();
    }

    public void exercise_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter value y1: ");
        double y1 = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter value x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter value y2: ");
        double y2 = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter value x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter value y3: ");
        double y3 = scanner.nextDouble();
        System.out.println();

        if((x1 - x2) * (y3 - y2) == (x3 - x2) * (y1 - y2)) {
            System.out.println("The points lie on the same line");
        }
        else {
            System.out.println("Points do not lie on the same line");
        }

        System.out.println();
    }

    public void exercise_4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value hole height: ");
        double holeHeight = scanner.nextDouble();
        System.out.print("Enter value hole width: ");
        double holeWidth = scanner.nextDouble();
        System.out.println();

        System.out.print("Enter value brick height: ");
        double brickHeight = scanner.nextDouble();
        System.out.print("Enter value brick width: ");
        double brickWidth = scanner.nextDouble();
        System.out.print("Enter value brick depths: ");
        double brickDepths = scanner.nextDouble();
        System.out.println();

        if (brickHeight <= holeHeight && brickWidth <= holeWidth || brickWidth <= holeHeight && brickHeight <= holeWidth ||
                brickHeight <= holeHeight && brickDepths <= holeWidth || brickDepths <= holeHeight && brickHeight <= holeWidth ||
                brickDepths <= holeHeight && brickWidth <= holeWidth || brickWidth <= holeHeight && brickDepths <= holeWidth) {
            System.out.println("The brick will go through the hole");
        }
        else {
            System.out.println("Brick will not go through the hole");
        }

        System.out.println();
    }

    public void exercise_5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value x: ");
        double x = scanner.nextDouble();

        if(x <= 3) {
            System.out.println("Value F(x) = " + (Math.pow(x, 2) - 3 * x + 9));
        }
        else if (x > 3) {
            System.out.println("Value F(x) = " + (1 / (Math.pow(x, 3) + 6)));
        }

        System.out.println();
    }
}
