package ru.job4j.array;

public class Matrix {

    public static int[][] multiply(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 4;
        int[][] rsl = multiply(size);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j] + " ");
            }
            System.out.println();
        }
    }
}
