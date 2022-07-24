package org.example;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays {
    public void exercise_1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.print("Enter the number to divide by: ");
        int numberToDivide = scanner.nextInt();

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
            if((array[i] % numberToDivide) == 0) {
                sum += array[i];
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        System.out.println();
    }

    public void exercise_2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.print("Enter the number to which we will change: ");
        int replacementNumber = scanner.nextInt();

        int numberOfSubstitutions = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
            if(array[i] > replacementNumber) {
                array[i] = replacementNumber;
                numberOfSubstitutions++;
            }
        }

        System.out.println();

        System.out.println("Number of substitutions: " + numberOfSubstitutions);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }

    public void exercise_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        int numberOfPositiveElements = 0;
        int numberOfNegativeElements = 0;
        int numberOfZeroElements = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 200) - 100);
            System.out.print(array[i] + ", ");

            if(array[i] > 0) {
                numberOfPositiveElements++;
            } else if (array[i] < 0) {
                numberOfNegativeElements++;
            } else {
                numberOfZeroElements++;
            }
        }

        System.out.println();

        System.out.println("Number of positive elements: " + numberOfPositiveElements);
        System.out.println("Number of negative elements: " + numberOfNegativeElements);
        System.out.println("Number of zero elements: " + numberOfZeroElements);

        System.out.println();
    }

    public void exercise_4() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        int largestElement = 0;
        int smallestElement = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i] >= array[largestElement]) {
                largestElement = i;
            }
            if(array[i] < array[smallestElement]){
                smallestElement = i;
            }
        }

        int number = array[largestElement];

        array[largestElement] = array[smallestElement];
        array[smallestElement] = number;

        for(int i: array) {
            System.out.print(i + ", ");
        }

        System.out.println();
    }

    public void exercise_5() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        for(int i = 0; i < array.length; i++) {
            if(array[i] > i) {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();
    }

    public void exercise_6() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");

            if(i != 1 && i % 2 != 0 && i % 3 != 0) {
                sum += array[i];
            }
        }

        System.out.println();

        System.out.println("Sum = " + sum);

        System.out.println();
    }

    //exercise_7

    public void exercise_8() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        int[] newArray = new int[arraySize];
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] != min) {
                newArray[i] = array[i];
                System.out.print(newArray[i] + ", ");
            }
        }

        System.out.println();
    }

    //invalid
    public void exercise_9() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        int totalNumberOfElements = 0;
        int finalElementNumber = 0;

        for(int i = 0; i < array.length; i++) {
            int amountOfElements = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[j] == array[i]) {
                    amountOfElements++;
                }
            }
            if(amountOfElements > totalNumberOfElements) {
                totalNumberOfElements = amountOfElements;
                finalElementNumber = i;
            }
            else if(amountOfElements == totalNumberOfElements) {
                totalNumberOfElements = amountOfElements;
                finalElementNumber = Math.min(array[finalElementNumber], array[i]);
            }
        }

        System.out.println("Most common number: " + array[finalElementNumber] + " | " + totalNumberOfElements);

        System.out.println();
    }

    public void exercise_10() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        for(int i = 0; i < array.length; i+=2) {
            array[i + 1] = 0;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }
}
