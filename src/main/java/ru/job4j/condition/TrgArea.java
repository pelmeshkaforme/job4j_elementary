package ru.job4j.condition;

public class TrgArea {
     public static double area(double a, double b, double c) {
         double p = (a + b + c) / 2;
         double squaretriangle = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
         return squaretriangle;
     }

     public static void main(String[] args) {
         double a = 3;
         double b = 4;
         double c = 5;
         double result = TrgArea.area(a, b, c);
         System.out.println("When sides of triange are " + a + ", " + b + " and " + c + " - square of triangle is " + result);
    }
}
