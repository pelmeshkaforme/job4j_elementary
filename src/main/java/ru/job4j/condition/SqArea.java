package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double s = (p / (2 * (k + 1))) * (p / (2 * (k + 1))) * k;
        return s;
    }

     public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = SqArea.square(p, k);
        System.out.println("When p=" + p + " and k=" + k + " - square is " + result);
     }
}
