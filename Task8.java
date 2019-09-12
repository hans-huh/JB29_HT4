package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать
 * число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner;
        int[] array;
        int range = 0;
        int n = 0;
        int result = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("How many elements do you want to have in the array? ");
        n = scanner.nextInt();

        // Create an array and fill it with random numbers
        array = new int[n];
        range = n * 50;
        array = randomize(array, range);

        // find the second max element from the array
        result = findSecondMax(array);
        System.out.println("The second biggest number in the array \n" + Arrays.toString(array) + "\nis " + result);
    }


    public static int[] randomize(int[] array, int range){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= range; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for(int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }
        return array;
    }

    public static int findSecondMax(int[] array){
        int i = 2; // used to get the index of second max
        Arrays.sort(array); // sort the array in ascending order
        return array[array.length - i]; // returning the second last element from the array
    }
}
