package ru.job4j.ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double x2minusx1 = x2 - x1;
        double y2minusy1 = y2 - y1;
        double x2minusx1square = Math.pow(x2minusx1, 2);
        double y2minusy1square = Math.pow(y2minusy1, 2);
        double sumofsquares = x2minusx1square + y2minusy1square;
        double total = Math.sqrt(sumofsquares);
        return total;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("Distance from point (" + x1 + "," + y1 + ") to point (" + x2 + "," + y2 + ") is " + result);
    }
}
