package ru.job4j.condition;

public class Film {

    public static String permit(int age) {
        String label = age >= 18 ? "Enjoy the film." : "You can't watch this film.";
        return label;
    }

    public static void main(String[] args) {
        String msg = Film.permit(17);
        System.out.println(msg);
    }
}
