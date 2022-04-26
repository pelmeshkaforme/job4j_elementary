package ru.job4j.loop;

public class DegreeLoo {

    public static int calculate(int a, int n) {
        int rsl = a;
        for (int i = 1; i < n; i++) {
            rsl = rsl * a;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
}
