package ru.job4j.loop;

public class Abbreviation {

    public static String collect(String s) {
        char firstWord = s.charAt(0);
        String rsl = String.valueOf(firstWord);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                rsl = rsl + s.charAt(i + 1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(collect("Flight Control Unit"));
    }
}
