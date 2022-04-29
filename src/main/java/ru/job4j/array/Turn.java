package ru.job4j.array;

public class Turn {
    
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        int[] rsl = back(data);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
    }
}
