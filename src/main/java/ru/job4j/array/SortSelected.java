package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexOfMin = FindLoop.indOf(data, min);
            SwitchArray.swap(data, indexOfMin, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {7, 1, 2};
        for (int i : sort(data)) {
            System.out.println(i);
        }
    }
}
