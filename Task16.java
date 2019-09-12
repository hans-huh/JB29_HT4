package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и
 * 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше
 * 2. Для решения задачи использовать декомпозицию.
 */

public class Task16 {
    public static void main(String[] args) {
        long n = 0;
        long[] primes;

        // get user's input
        n = getNumber();

        // finding all primes
        primes = findPrimes(n, 2*n);

        printPrimeSiblings(primes);

    }


    public static long getNumber(){
        long n = 0;
        Scanner scanner;
        boolean meetCondition;

        // Getting user's input
        scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the value of n: ");
            n = scanner.nextLong();
            if(n <= 2){
                System.out.println("The number does not meet the condition n > 2, please try again!");
                meetCondition = false;
            } else {
                meetCondition = true;
            }

        } while(!meetCondition);

        return n;
    }


    public static long[] findPrimes(long a, long b){
        long[] result;
        ArrayList<Long> list = new ArrayList<>();
        for(long i = a; i <= b; i++){
            if(checkPrime(i)){
                list.add(i);
            }
        }
        result = new long[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }


    public static void printPrimeSiblings(long[] array){
        long actual = 0;
        long next = 0;
        System.out.println("In the specified range, the prime siblings are:");
        for(int i = 0; i < array.length - 1; i++){
            actual = array[i];
            next = array[i + 1];
            if( (actual + 2) == next ){
                System.out.println(actual + "," + next);
            }
        }
    }


    public static boolean checkPrime(long n){
        for(int i = 2; i <= (n / 2); i++){
            if(n % (long) i == 0){
                return false;
            }
        }
        return true;
    }
}
