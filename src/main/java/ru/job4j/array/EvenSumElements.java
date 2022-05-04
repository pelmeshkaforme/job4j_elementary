package ru.job4j.array;

public class EvenSumElements {

    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(checkArray(data));
    }
}
