package ru.job4j.array;

public class SwapRows {

    public static int[][] swap(int[][] data, int src, int dest) {
        for (int i = src; i < src + 1; i++) {
            for (int j = 0; j < data[src].length; j++) {
                int temp = data[i][j];
                data[i][j] = data[dest][j];
                data[dest][j] = temp;
            }
        }
        return data;
    }

    public static int[][] swapCell(int[][] data, int src, int dest) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j <= data[i].length; j++) {
                if (j == src) {
                    int temp = data[i][j];
                    data[i][j] = data[i][dest];
                    data[i][dest] = temp;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 4},
                {5, 5, 5}
        };
        int[][] rsl = swap(data, 0, 1);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j]);
            }
            System.out.println();
        }
        int[][] rsl1 = swapCell(data, 0, 1);
        for (int i = 0; i < rsl1.length; i++) {
            for (int j = 0; j < rsl1[i].length; j++) {
                System.out.print(rsl1[i][j]);
            }
            System.out.println();
        }
    }
}
