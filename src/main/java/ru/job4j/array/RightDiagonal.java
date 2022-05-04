package ru.job4j.array;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (j == data.length - 1 - i) {
                    rsl[i] = data[i][data.length - 1 - i];
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] data = {
                {4, 2, 9},
                {3, 4, 1},
                {4, 2, 1}
        };
        int[] rsl = diagonal(data);
        for (int diag : rsl) {
            System.out.println(diag);
        }
    }
}
