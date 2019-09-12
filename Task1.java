package by.ld.hw.dec;

import java.util.Scanner;

/**
 * Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 */

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner;
        Triangle triangle;
        double x1 = 0, y1 = 0;
        double x2 = 0, y2 = 0;
        double x3 = 0, y3 = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Calculating S of a triangle with the given vertices");
        System.out.println("\nTaking the coordinates of vertex A... ");
        System.out.println("Enter the value of x: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y1 = scanner.nextDouble();
        System.out.println("Taking the coordinates of vertex B... ");
        System.out.println("Enter the value of x: ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y2 = scanner.nextDouble();
        System.out.println("Taking the coordinates of vertex C... ");
        System.out.println("Enter the value of x: ");
        x3 = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y3 = scanner.nextDouble();

        // creating an instance of Triangle
        triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        // calculating S of the triangle
        System.out.println("\n\nS of a triangle with vertices A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 +
                "), C(" + x3 + "," + y3 + ") is");
        System.out.println(triangle.calculateS());
    }
}


class Triangle{
    double x1 = 0, y1 = 0;
    double x2 = 0, y2 = 0;
    double x3 = 0, y3 = 0;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double calculateS(){
        double s = 0;
        double sp = 0;
        double ab = 0;
        double bc = 0;
        double ac = 0;

        // let's find the sides of the triangle
        ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        // let's find the semi-perimeter
        sp = (ab + bc + ac) / 2;

        // let's use Heron's formula for traingles to calculate S of a triangle
        return Math.sqrt(sp * (sp - bc) * (sp - ac) * (sp - ab));

    }

}
