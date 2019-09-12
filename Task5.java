package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner;
        final int TOTAL_NUMBERS = 3;
        double[] numbers;

        // Getting user's input
        scanner = new Scanner(System.in);
        numbers = new double[TOTAL_NUMBERS];

        System.out.println("Please enter " + TOTAL_NUMBERS + " numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("The smallest number from " + Arrays.toString(numbers) + " is " + getMin(numbers));
        System.out.println("The biggest number from " + Arrays.toString(numbers) + " is " + getMax(numbers));
    }


    public static double getMin(double[] array){
        double min = Double.POSITIVE_INFINITY;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static double getMax(double[] array){
        double max = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
