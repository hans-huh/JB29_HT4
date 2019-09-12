package by.ld.hw.dec;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
 * элементов массива с номерами от k до m.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner;
        final int ARRAY_SIZE = 7; // Making an array of at least 7 ints in order to solve the intial problem
        int[] numbers;
        int sum = 0;
        int k;
        int m;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("What is the value of k: ");
        k = scanner.nextInt();
        System.out.println("What is the value of m: ");
        m = scanner.nextInt();

        // Create an array and fill it in with random numbers
        numbers = randomize(ARRAY_SIZE);
        System.out.println("\nIn the array " + Arrays.toString(numbers));

        // calculating sum
        sum = calculateSumInRange(numbers, k, m);
        System.out.println("When k=" + k + " and m=" + m);
        System.out.println("Your sum is " + sum);



        // This section is used to solve the initial problem  and can be commented out
        // Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
        k = 1;
        m = 3;
        sum = calculateSumInRange(numbers, k, m);
        System.out.println("\nWhen k=" + k + " and m=" + m + " sum of elements equals " + sum);

        k = 3;
        m = 5;
        sum = calculateSumInRange(numbers, k, m);
        System.out.println("When k=" + k + " and m=" + m + " sum of elements equals " + sum);

        k = 4;
        m = 6;
        sum = calculateSumInRange(numbers, k, m);
        System.out.println("When k=" + k + " and m=" + m + " sum of elements equals " + sum);
    }


    public static int[] randomize(int size){
        final int RANGE = 100; // array will be filled with random numbers from 1 to 100
        int[] array;

        // creating an array
        array = new int[size];

        // fill in the array with random ints
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * RANGE) + 1;
        }
        return array;
    }


    public static int calculateSumInRange(int[] array, int k, int m){
        int sum = 0;
        if(k >= array.length || m >= array.length){
            System.out.println("k or m are bigger than the array max index");
            return 0;
        }
        for(int i = k; i <= m; i++){
            sum += array[i];
        }
        return sum;
    }
}
