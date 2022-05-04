package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * right.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (left[i][j] >= right[i][j]) {
                    rsl[i * left.length + j] = left[i][j];
                } else {
                    rsl[i * left.length + j] = right[i][j];
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] left = {
                {1, 2, 3},
                {3, 4, 2},
                {4, 6, 7}
        };
        int[][] right = {
                {2, 5, 8},
                {4, 2, 6},
                {8, 5, 4}
        };
        int[] rsl = collectArray(left, right);
        for (int rs : rsl) {
            System.out.print(rs);
        }
    }
}
