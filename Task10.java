package by.ld.hw.dec;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task10 {
    public static void main(String[] args) {
        long sum = 0;
        final int MAX_RANGE = 9;
        long[] numbers;

        // fill in the array with odd digits within the specified range
        numbers = fillArray(MAX_RANGE);

        // Getting factorials of the digits in the array
        numbers = calculateFactorials(numbers);

        // getting the sum of the factorials
        sum = calculateSumOfFactorials(numbers);
        System.out.println("The sum of factorials from 1 to " + MAX_RANGE + " is " + sum);
    }


    public static long[] fillArray(int range){
        long[] array;
        int size = 0;

        // getting the size of the array that contains ONLY odd numbers in a set of a specific range
        size = (range / 2) + 1;

        // creating an array of longs
        array = new long[size];

        // filling in the array with odd digits
        for(int i = 0, k = 1; i < array.length; i++, k+= 2){
            array[i] = k;
        }
        return array;
    }


    public static long[] calculateFactorials(long[] array){
        long[] result;

        // creating an array with results
        result = new long[array.length];

        for(int i = 0; i < array.length; i++){
            result[i] = getFactorial(array[i]);
        }
        return result;
    }


    public static long getFactorial(long a){
        long result = 0;
        if(a == 0 || a == 1){
            return 1;
        }
        result = getFactorial(a - 1) * a;
        return result;
    }


    public static long calculateSumOfFactorials(long[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
