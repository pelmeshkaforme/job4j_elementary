package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Andrei";
        names[2] = "Anna";
        names[3] = "Olga";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
