package ru.job4j.array;

public class SkipNegative {

    public static int[][] skip(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < 0) {
                    data[i][j] = 0;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, -2, -4},
                {0, 0, -1, 4, 9},
                {-1, -6, 0, -2}
        };
        int[][] rsl = skip(data);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j]);
            }
            System.out.println();
        }
    }
}
