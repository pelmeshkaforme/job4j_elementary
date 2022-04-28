package ru.job4j.loop;

public class Symmetry {

    public static boolean check(int num) {
        boolean rsl = true;
        String s = String.valueOf(num);
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(check(15552));
    }
}
