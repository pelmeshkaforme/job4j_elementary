package ru.job4j.loop;

public class ModWithLoop {

    public static int mod(int d, int n) {
        int sum = 0;
        while (sum <= n) {
            sum = sum + d;
        }
        return n - (sum - d);
    }

    public static void main(String[] args) {
        System.out.println(mod(5, 23));
    }
}
