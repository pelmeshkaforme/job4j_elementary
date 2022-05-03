package ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] data, int from, int to) {
        int min = data[from];
        for (int i = from + 1; i <= to; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] data = {7, 1, 1};
        System.out.println(findMin(data, 0, 2));
    }
}
