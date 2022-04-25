package ru.job4j.loop;

public class Slash {

    public static void draw(int num) {
        for (int row = 1; row <= num; row++) {
            for (int cell = 1; cell <= num; cell++) {
                if ((row == cell) || ((row + cell) % (num + 1) == 0)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(3);
        System.out.println();
        draw(5);
        System.out.println();
        draw(7);
        System.out.println();
        draw(9);
    }
}
