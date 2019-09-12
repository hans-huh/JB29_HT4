package by.ld.hw.dec;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task9 {
    public static void main(String[] args) {

        int[] numbers;
        boolean isComprime;
        final int TOTAL_NUMBERS = 3;

        // Get user's input
        numbers = getInput(TOTAL_NUMBERS);

        // Send the input to comparator
        isComprime = comprimeCheck(numbers);

        // print result
        printResult(isComprime, numbers);
    }


    public static int[] getInput(int total){
        Scanner scanner;
        int[] numbers;

        scanner = new Scanner(System.in);
        numbers = new int[total];
        System.out.println("Enter " + total + " numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }


    public static boolean comprimeCheck(int[] array){
        boolean isPrime = true;
        for(int i = 0; i < array.length - 1; i++){
            for(int k = i + 1; k < array.length; k++){
                if(getGCD(array[i], array[k]) != 1){ // checking if the resulted Greatest Common Divisor is bigger than 1
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }


    public static void printResult(boolean isComprime, int[] array){
        if(isComprime){
            System.out.println("Digits " + Arrays.toString(array) + " are mutually prime.");
        } else {
            System.out.println("Digits " + Arrays.toString(array) + " are NOT mutually prime");
        }
    }


    public static int getGCD(int a, int b){
        if(b == 0){
            return a;
        } else if(a < b){
            return getGCD(a, b % a);
        } else {
            return getGCD(b, a % b);
        }
    }
}
