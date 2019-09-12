package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его
 * площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner;

        // fields to store the sides of the tetragon
        double x;
        double y;
        double z;
        double t;
        double s = 0;

        // Getting the lengths of the sides
        scanner = new Scanner(System.in);
        System.out.println("What is the length of X: ");
        x = scanner.nextDouble();
        System.out.println("What is the length of Y: ");
        y = scanner.nextDouble();
        System.out.println("What is the length of Z: ");
        z = scanner.nextDouble();
        System.out.println("What is the length of T: ");
        t = scanner.nextDouble();

        // Calculating S of the tetragon with given sides X, Y, Z, T
        s = findTetragonArea(x, y, z, t);
        System.out.println("S=" + s + " square units, given X=" + x + ", Y=" + y + ", Z=" + z + ", T=" + t + " and the angle between X and Y is 90 degrees");
    }


    public static double findTetragonArea(double x, double y, double z, double t){
        double s = 0;
        s = findSquaredTriangleArea(x, y) + findTriangleAreagThreeSides(z, t, findHypotenuse(x, y));
        return s;
    }


    public static double findHypotenuse(double a, double b){
        double hypotenuse = 0;
        hypotenuse = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
        return hypotenuse;
    }


    public static double findTriangleAreagThreeSides(double a, double b, double c){
        double s = 0;
        double hp = 0; // half of perimeter

        // finding the half of perimeter
        hp = (a + b + c) / 2;

        // find the s of the triangle given three sides
        s = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
        return s;
    }


    public static double findSquaredTriangleArea(double a, double b){
        double s = 0;
        s = (a * b) / 2;
        return s;
    }
}
