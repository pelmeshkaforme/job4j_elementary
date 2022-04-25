package ru.job4j.loop;

public class Fitness {

    public static int force(int ivan, int nicola) {
        int month = 0;
        while (ivan < nicola) {
            ivan *= 3;
            nicola *= 2;
            month = month + 1;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(force(20, 50));
        System.out.println(force(10, 50));
        System.out.println(force(10, 5));
        System.out.println(force(10, 10));
    }
}
