package ru.job4j.loop;

public class Board {

    public static void paint(int width, int heigth) {
         if (heigth % 2 != 0) {
             for (int row = 1; row <= heigth; row++) {
                 for (int column = 1; column <= width; column++) {
                     if (row % 2 != 0) {
                         if (column % 2 == 0) {
                             System.out.print(" ");
                         } else {
                             System.out.print("x");
                         }
                     } else {
                         if (column % 2 == 0) {
                             System.out.print("x");
                         } else {
                             System.out.print(" ");
                         }
                     }
                 }
                 System.out.println();
             }
         } else {
             for (int row = 1; row <= heigth; row++) {
                 for (int column = 1; column <= width; column++) {
                     if (row % 2 != 0) {
                         if (column % 2 == 0) {
                             System.out.print("x");
                         } else {
                             System.out.print(" ");
                         }
                     } else {
                         if (column % 2 == 0) {
                             System.out.print(" ");
                         } else {
                             System.out.print("x");
                         }
                     }
                 }
                 System.out.println();
             }
         }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}