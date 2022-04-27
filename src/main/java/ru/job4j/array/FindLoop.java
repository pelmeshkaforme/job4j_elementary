package ru.job4j.array;

public class FindLoop {

    public static int indOf(int[] data, int element) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = new int[] {1, 4, 5, 6, 8};
        System.out.println(indOf(data, 5));
    }

}