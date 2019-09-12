package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner;
        final int NUMBER_OF_DIGITS = 4;
        int[] input;
        int result = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        input = new int[NUMBER_OF_DIGITS];
        System.out.println("Enter " + NUMBER_OF_DIGITS + " integers");
        for(int i = 0; i < input.length; i++){
            input[i] = scanner.nextInt();
        }

        // Calculating the greatest common divisor of NUMBER_OF_DIGITS elements
        result = calculateGCD(input);

        // Printing the result
        printResults(result, input);
    }


    public static int calculateGCD(int[] array){
        int result = array[0];
        for(int i = 1; i < array.length; i++){
            result = calculateGCDofTwo(result, array[i]);
        }
        return result;
    }

    public static int calculateGCDofTwo(int a, int b){
        if(b == 0){
            return a;
        } else if(a < b){
            return calculateGCDofTwo(a, b % a);
        } else {
            return calculateGCDofTwo(b, a % b);
        }
    }


    public static void printResults(int result, int[] array){
        System.out.print("The greatest common divisor of the numbers: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.print("is " + result);
    }
}
