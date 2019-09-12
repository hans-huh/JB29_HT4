package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
 * двух натуральных чисел
 */

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner;
        int a = 0;
        int b = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        b = scanner.nextInt();

        System.out.println("The greatest common divisor of " + a + " and " + b + " is " + getGCD(a, b));
        System.out.println("The least common multiplier of " + a + " and " + b + " is " + getLCM(a, b));

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

    public static int getLCM(int a, int b){
        return ( (a * b) / getGCD(a, b) );
    }

}
