package ru.job4j.array;

public class MatrixFind {

    public static void find(int[][] array, int element) {
        int row;
        int cell;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    row = i;
                    cell = j;
                    System.out.println("Индекса искомого числа равне: row = " + row + " , cell = " + cell);
                }
            }

        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 6, 7},
                {0, 0, 1, 1},
                {1, 3, 5, 1}
        };
        find(array, 1);
    }
}
