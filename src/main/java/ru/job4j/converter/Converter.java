package ru.job4j.converter;

public class Converter {
    public static float ruToEu(float value) {
        return value / 70;
    }

    public static float ruToDol(float value) {
        return value / 60;
    }

    public static float euToRu(float value) {
        return value * 70;
    }

    public static float dolToRu(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.ruToEu(in);
        boolean passed = expected == out;
        float euro = Converter.ruToEu(140);
        System.out.println("140 rubles are " + euro + " euros. Test result: " + passed);
        expected = 2.33333333F;
        out = Converter.ruToDol(in);
        passed = expected == out;
        float dollar = Converter.ruToDol(140);
        System.out.println("140 rubles are " + dollar + " dollars. Test result: " + passed);
        expected = 9800;
        out = Converter.euToRu(in);
        passed = expected == out;
        float rubles1 = Converter.euToRu(140);
        System.out.println("140 euros are " + rubles1 + " rubles. Test result: " + passed);
        expected = 8400;
        out = Converter.dolToRu(in);
        passed = expected == out;
        float rubles2 = Converter.dolToRu(140);
        System.out.println("140 doolars are " + rubles2 + " rubles. Test result: " + passed);
    }
}
