package ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] data, int from, int to) {
        int min = data[from];
        for (int i = from; i <= to; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 1, 8};
        System.out.println(findMin(data, 3, 6));
    }
}
