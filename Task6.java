package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника
 */

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner;
        double a = 0;
        double s = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();

        // Calculating S of the hexagon
        s = hexagonS(a);

        System.out.println("S of the hexagon with side a=" + a + " is " + s);

    }


    public static double hexagonS(double a){
        return (6 * equalTriangleS(a));
    }

    public static double equalTriangleS(double a){
        return ( (Math.sqrt(3) / 4) * Math.pow(a, 2) );
    }
}
