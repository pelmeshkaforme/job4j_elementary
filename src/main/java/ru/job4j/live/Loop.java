package ru.job4j.live;

public class Loop {

    public static void out(int n) {
        for (int i = 0; i < n; n++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        out(5);
    }
}
