package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task14 {
    public static void main(String[] args) {
        long a = 0;
        long b = 0;

        // Get numbers;
        a = getNumber();
        b = getNumber();

        // Compare the number of digits in those numbers
        compareNumOfDigits(a, b);
    }


    public static long getNumber(){
        long n = 0;
        Scanner scanner;

        // Get number
        scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextLong();

        return n;
    }


    public static void compareNumOfDigits(long a, long b){
        int first = 0;
        int second = 0;

        // getting the num of digits in a
        first = getNumOfDigits(a);
        // getting the num of digits in b
        second = getNumOfDigits(b);

        if(first > second){
            System.out.println("Number " + a + " contains more digits (" + first + " digit(s)) than number " + b + " (" + second + " digit(s))");
        } else if(first < second){
            System.out.println("Number " + b + " contains more digits (" + second + " digit(s)) than number " + a + " (" + first + " digit(s))");
        } else {
            System.out.println("Number of digits in " + a + " and " + b + " is the same");
        }
    }


    public static int getNumOfDigits(long n){
        int counter = 0;

        while(n > 0){
            n /= 10;
            counter++;
        }

        return counter;
    }
}
