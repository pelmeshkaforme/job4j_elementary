package ru.job4j.condition;

public class DummyBot {

    public static String bot(String answer) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот".equals(answer)) {
            rsl = "Привет, умник";
        } else if ("Пока".equals(answer)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.bot("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.bot("Пока");
        System.out.println(rsl);
        rsl = DummyBot.bot("Сколько будет 2+2?");
        System.out.println(rsl);
    }
}
