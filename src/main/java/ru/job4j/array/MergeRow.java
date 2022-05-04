package ru.job4j.array;

public class MergeRow {

    public static int[] merge(int[][] data) {
        int[] rsl = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                rsl[i * 3 + j] = data[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 3, 5},
                {1, 4, 7},
                {2, 2, 2}
        };
        int[] rsl = merge(data);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
