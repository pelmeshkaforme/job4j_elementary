package ru.job4j.loop;

public class Slash {

    public static void draw(int num) {
        for (int row = 0; row < num; row++) {
            for (int cell = 0; cell < num; cell++) {
                if ((row == cell) || (row + cell == num - 1)) {
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
