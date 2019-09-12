package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */

public class Task17 {
    public static void main(String[] args) {
        long k = 0;
        long[] narcissisticNums;

        // Getting the value of k from the user
        k = getNumber();

        // finding Armstrong numbers from a set [1... k]
        narcissisticNums = findNarcissticNums(1, k);

        // print Armstrong nubmers from a set [1... k]
        printNumbers(narcissisticNums);
    }


    public static long getNumber(){
        Scanner scanner;
        long k = 0;
        boolean meetCondition;

        scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the value of K: ");
            k = scanner.nextLong();
            if(k <= 1){
                System.out.println("The number does not meet the condition k > 1. Please try again!");
                meetCondition = false;
            } else {
                meetCondition = true;
            }
        } while(!meetCondition);

        return k;
    }


    public static long[] findNarcissticNums(long begin, long end){
        long temp = 0;
        long[] result;
        ArrayList<Long> list = new ArrayList<>();

        for(long i = begin; i <= end; i++){
            temp = getSum(i);
            if(i == temp){
                list.add(i);
            }
        }
        result = new long[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }


    public static int countDigits(long n){
        int counter = 0;

        while (n > 0){
            n /= 10;
            counter++;
        }

        return counter;
    }


    public static int getSum(long n){
        int power = 0;
        int temp = 0;
        int sum = 0;

        // getting the power
        power = countDigits(n);

        while(n > 0){
            temp = (int) Math.pow(n % 10, power);
            sum += temp;
            n /= 10;
        }

        return sum;
    }


    public static void printNumbers(long[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
