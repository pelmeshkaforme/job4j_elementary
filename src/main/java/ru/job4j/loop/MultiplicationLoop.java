package ru.job4j.loop;

import java.sql.SQLOutput;

public class MultiplicationLoop {

    public static int mult(int a, int b) {
        int rsl = 1;
        for (int i = a; i <= b; i++) {
            rsl = i * rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(mult(0, 5));
    }
}
