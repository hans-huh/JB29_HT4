package by.ld.hw.dec;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */

public class Task13 {
    public static void main(String[] args) {
        long n = 0;
        int[] digits;

        // Get N
        n = getNumber();

        // fill in the array with digits of N
        digits = fillArray(n);

        // print the results
        printResult(n, digits);
    }


    public static long getNumber(){
        Scanner scanner;
        long n = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        n = scanner.nextLong();

        return n;
    }


    public static int getSize(long n){
        int counter = 0;

        // Calculating the number of digits in N
        while (n > 0){
            n /= 10;
            counter++;
        }

        return counter;
    }


    public static int[] fillArray(long n){
        int size = 0;
        int[] array;

        // create an array where array.length == number of digits in N
        size = getSize(n);
        array = new int[size];

        // fill in the array with digits in N
        for(int i = array.length - 1; i >= 0; i--){
            array[i] = (int) (n % 10);
            n /= 10;
        }

        return array;
    }


    public static void printResult(long n, int[] array){
        System.out.println("Given N=" + n + ", the array is " + Arrays.toString(array));
    }
}
