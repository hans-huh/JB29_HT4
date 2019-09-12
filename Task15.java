package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
 * которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner;
        long n = 0;
        int k = 0;
        long[] result;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        n = scanner.nextLong();
        System.out.println("Enter the value of K: ");
        k = scanner.nextInt();

        // making an array
        result = makeArray(n, k);

        // Printing the result
        System.out.println("Given that N=" + n + ", and K=" + k + ", the resulting array is ");
        System.out.println(Arrays.toString(result));
    }


    public static long[] makeArray(long n, int k){
        long[] array;
        ArrayList<Long> list = new ArrayList<>();

        for(long i = 1; i <= n; i++){
            if(getSumOfDigits(i) == k){
                list.add(i);
            }
        }
        array = new long[list.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }

        return array;
    }


    public static int getSumOfDigits(long n){
        int sum = 0;
        while(n > 0){
            sum = sum + (int) (n % 10);
            n /= 10;
        }

        return sum;
    }
}
