package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean[] name = {false, false, false};
        System.out.println(mono(name));
    }
}
