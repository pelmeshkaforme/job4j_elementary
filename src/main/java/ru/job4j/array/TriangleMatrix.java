package ru.job4j.array;

public class TriangleMatrix {

    public static int[][] matrix(int count) {
        int[][] triangle = new int[count][];
        int rsl = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = rsl++;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        int[][] rsl = matrix(4);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j]);
            }
            System.out.println();
        }
    }
}
