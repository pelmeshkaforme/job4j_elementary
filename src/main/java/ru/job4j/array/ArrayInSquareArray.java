package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] data) {
        double coren = Math.sqrt(data.length);
        int rsl11 = (int) coren;
        int lengthOfRsl = rsl11 + 1;
        int[][] rsl = new int[lengthOfRsl][lengthOfRsl];
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 5, 6};
        int[][] rsl = convertArray(data);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j]);
            }
            System.out.println();
        }
    }
}
