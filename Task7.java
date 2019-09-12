package by.ld.hw.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
 * какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Task7 {
    public static void main(String[] args) {

        double[] input;
        double[] result;

        // Getting user's input
        input = getInput();

        // finding the biggest length between two points
        result = new double[4];
        result = comparePoints(input);

        // printing the result
        System.out.print("The biggest is the length between point " + result[0] + "," + result[1] +
                " and point " + result[2] + "," + result[3]);

    }


    public static double[] getInput(){

        Scanner scanner = new Scanner(System.in);
        char controller = 'Y';
        int counter = 0;
        double x = 0;
        double y = 0;
        double[] array;
        ArrayList<Double> list = new ArrayList<>();

        do{
            // Making an ArrayList of double to store an arbitrary number of doubles
            // that ArrayList is then converted to an array of doubles
            System.out.println("Enter the value of x: ");
            x = scanner.nextDouble();
            list.add(x);
            System.out.println("Enter the value of y: ");
            y = scanner.nextDouble();
            list.add(y);
            counter++;
            if(counter > 2){
                do{
                    System.out.println("Do you want to add more points? (Y/N)");
                    controller = scanner.next().toUpperCase().charAt(0);
                }
                while(controller != 'Y' &&  controller != 'N');
            }
        } while(controller == 'Y');

        // convert ArrayList into array of doubles
        array = new double[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }



    public static double[] comparePoints(double[] array){
        double maxLength = Double.NEGATIVE_INFINITY;
        double temp = 0;
        double[] resultPoints = new double[4];

        // using these to store coordinates of first point
        double x1 = 0;
        double y1 = 0;

        // using this to store coordinates of second point
        double x2 = 0;
        double y2 = 0;

        // setting initial value
        for(int i = 0; i <= array.length - 2; i += 2){
            for(int k = i + 2; k < array.length; k += 2){
                x1 = array[i];
                y1 = array[i + 1];
                x2 = array[k];
                y2 = array[k + 1];

                temp = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

                if(temp > maxLength){
                    maxLength = temp;
                    resultPoints[0] = x1;
                    resultPoints[1] = y1;
                    resultPoints[2] = x2;
                    resultPoints[3] = y2;
                }
            }
        }
        return resultPoints;
    }

}
