package ru.job4j.array;

public class UpperCase {

    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                rsl[i] = Character.toUpperCase(string[i]);
            } else {
                rsl[i] = string[i];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[] string = {'a', 'b', 'c', '2', '-', '3', 'r'};
        char[] rsl = toUpperCase(string);
        for (char rsl1 : rsl) {
            System.out.print(rsl1);
        }
    }
}
