package by.ld.hw.dec;


import java.util.Scanner;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько
 * таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task20 {
    public static void main(String[] args) {
        long n = 0;
        Scanner scanner;
        int counter = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextLong();

        counter = findNumOfOperations(n);

        System.out.println("Given n=" + n + ", the total number of operations is " + counter);
    }


    public static int findNumOfOperations(long n){
        int result = 1;

        if(n == 0){
            return 0;
        }
        result = result + findNumOfOperations(n - getSumOfDigits(n));

        return result;
    }


    public static int getSumOfDigits(long n){
        int sum = 0;
        int temp = 0;

        while(n > 0){
            temp = (int) n % 10;
            sum += temp;
            n /= 10;
        }

        return sum;
    }
}
