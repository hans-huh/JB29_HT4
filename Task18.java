package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task18 {
    public static void main(String[] args) {
        int n = 0;
        long begin = 0;
        long end = 0;
        long[] series;

        // Getting the value of n:
        n = getNumber();

        // Getting the range of n-digit numbers
        begin = (long) Math.pow(10, n - 1);
        end = (long) (Math.pow(10, n) - 1);

        // Find these numbers
        series = findSeries(begin, end);

        // Print the numbers
        System.out.println("For " + n + "-digit numbers, the values are the following: ");
        printNumbers(series);


    }


    public static int getNumber(){
        Scanner scanner;
        int n = 0;
        boolean meetCondition;

        scanner = new Scanner(System.in);
        do{
            System.out.println("\nEnter the value of n: ");
            n = scanner.nextInt();
            if(n <= 1 || n > 9){
                System.out.println("Your numbers should have at least two digits and should not have more than 9 digits in them. Try again!");
                meetCondition = false;
            } else {
                meetCondition = true;
            }

        } while (!meetCondition);

        return n;
    }


    public static long[] findSeries(long start, long end){
        long[] series;
        ArrayList<Long> list = new ArrayList<>();

        for(long i = start; i <= end; i++){
            if(checkAscendingSequence(i)){
                list.add(i);
            }
        }

        series = new long[list.size()];
        for(int i = 0; i < series.length; i++){
            series[i] = list.get(i);
        }

        return series;
    }


    public static boolean checkAscendingSequence(long n){
        int maxDigit = Integer.MAX_VALUE;
        int temp = 0;

        while(n > 0){
            temp = (int) n % 10;
            if(temp >= maxDigit){
                return false;
            }
            maxDigit = temp;
            n /= 10;
        }

        return true;
    }


    public static void printNumbers(long[] numbers){
        int counter = 0;
        for(long i : numbers){
            if(counter >= 9){
                System.out.println();
                counter = 0;
            }
            System.out.print(i + " ");
            counter++;
        }
    }
}
