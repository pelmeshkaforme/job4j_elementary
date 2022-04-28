package ru.job4j.array;

public class ArrayChar {

    public static boolean startWith(char[] word, char[] pref) {
        boolean rsl = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[] first = {'A', 'i', 'r', 'b', 'u', 's'};
        char[] start = {'A', 'i', 'r'};
        System.out.println(startWith(first, start));
    }
}
