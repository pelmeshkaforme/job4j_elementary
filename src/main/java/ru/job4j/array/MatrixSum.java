package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] data) {
        int rsl = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl += data[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 1, 1, 1},
                {1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        System.out.println(sum(data));
    }
}
