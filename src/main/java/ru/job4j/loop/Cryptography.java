package ru.job4j.loop;

public class Cryptography {

    public static String code(String s) {
        String rsl = s;
        if (s == "") {
            rsl = "Empty";
        } else if (s.length() <= 4) {
            rsl = s;
        } else {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length() - 4; i++) {
                sb.setCharAt(i, 'X');
                rsl = sb.toString();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(code(""));
        System.out.println(code("123"));
        System.out.println(code("44444444"));
    }
}
