package ru.job4j.loop;

public class Board {

    public static void paint(int width, int heigth) {
        for (int row = 1; row <= heigth; row++) {
            for (int column = 1; column <= width; column++) {
                if ((row + column) % 2 == 0) {
                        System.out.print("x");
                    } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
