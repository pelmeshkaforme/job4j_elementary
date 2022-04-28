package ru.job4j.array;

public class EndsWith {

    public static boolean end(char[] word, char[] post) {
        boolean rsl = true;
        for (int i = 0; i <= post.length - 1; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[] word = {'F', 'l', 'i', 'g', 'h', 't'};
        char[] post = {'i', 'g', 'h', 't'};
        System.out.println(end(word, post));
    }
}
