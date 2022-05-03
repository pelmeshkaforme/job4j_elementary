package ru.job4j.array;

public class Transposition {

    public static int[][] convert(int[][] matrix) {
        int[][] rsl = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rsl[j][i] = matrix[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 3, 5},
                {2, 4, 6}
        };
        int[][] rsl = convert(data);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j]);
            }
            System.out.println();
        }
    }
}
