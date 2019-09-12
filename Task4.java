package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner;
        final int NUMBER_OF_DIGITS = 4;
        int[] input;
        int gcd = 0;
        int lcm = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        input = new int[NUMBER_OF_DIGITS];
        System.out.println("Enter " + NUMBER_OF_DIGITS + " integers");
        for(int i = 0; i < input.length; i++){
            input[i] = scanner.nextInt();
        }

        // Calculating the least common multiplier of NUMBER_OF_DIGITS elements

        lcm = calculateLCM(input);

        // Printing the result
        printResults(lcm, input);
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

    public static int calculateLCM(int array[]){
        int result = calculateLCMofTwo(array[0], array[1]);
        for(int i = 2; i < array.length; i++){
            result = calculateLCMofTwo(result, array[i]);
        }
        return result;
    }


    public static void printResults(int result, int[] array){
        System.out.print("The least common multiple of the numbers: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.print("is " + result);
    }

    public static int calculateLCMofTwo(int a, int b){
        return (a * b) / calculateGCDofTwo(a, b);
    }
}
