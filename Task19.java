package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
 * декомпозицию.
 */

public class Task19 {
    public static void main(String[] args) {
        int n = 0;
        long begin = 0;
        long end = 0;
        long sum = 0;
        int numberOfEvens = 0;

        // Getting the value of n:
        n = getNumber();

        begin = (long) Math.pow(10, n - 1);
        end = (long) (Math.pow(10, n) - 1);

        sum = findSum(begin, end);

        numberOfEvens = countEvens(sum);

        System.out.println("Sum = " + sum);
        System.out.println("Number of even digits in the sum = " + numberOfEvens);


    }


    public static int getNumber(){
        int n = 0;
        Scanner scanner;
        boolean meetCondition;

        scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the value of n: ");
            n = scanner.nextInt();
            if(n < 1 || n > 10){
                System.out.println("Your numbers should have at least one digit and should not have more than 10 digits in them. Try again!");
                meetCondition = false;
            } else {
                meetCondition = true;
            }
        } while (!meetCondition);

        return n;
    }


    public static long findSum(long start, long end){
        long sum = 0;
        for(long i = start; i <= end; i++){
            if(!checkEvens(i)){
                sum += i;
            }
        }
        return sum;
    }


    public static boolean checkEvens(long n){
        int temp = 0;

        while(n > 0){
            temp = (int) n % 10;
            if(temp % 2 == 0){
                return true;
            }
            n /= 10;
        }

        return false;
    }

    public static int countEvens(long n){
        int counter = 0;
        int temp = 0;

        while (n > 0){
            temp = (int) n % 10;
            if(temp % 2 == 0 && temp != 0){
                counter++;
            }
            n /= 10;
        }

        return counter;
    }
}
