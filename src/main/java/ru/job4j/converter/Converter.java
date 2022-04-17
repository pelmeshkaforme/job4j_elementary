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
        float inruToEu = 140;
        float expectedruToEu = 2;
        float outruToEu = Converter.ruToEu(inruToEu);
        boolean passedruToEu = expectedruToEu == outruToEu;
        float euro = Converter.ruToEu(140);
        System.out.println("140 rubles are " + euro + " euros. Test result: " + passedruToEu);
        float inruToDol = 140;
        float expectedruToDol = 2.33333333F;
        float outruToDol = Converter.ruToDol(inruToDol);
        boolean passedruToDol = expectedruToDol == outruToDol;
        float dollar = Converter.ruToDol(140);
        System.out.println("140 rubles are " + dollar + " dollars. Test result: " + passedruToDol);
        float ineuToRu = 140;
        float expectedeuToRu = 9800;
        float outeuToRu = Converter.euToRu(ineuToRu);
        boolean passedeuToRu = expectedeuToRu == outeuToRu;
        float rubles1 = Converter.euToRu(140);
        System.out.println("140 euros are " + rubles1 + " rubles. Test result: " + passedeuToRu);
        float indolToRu = 140;
        float expecteddolToRu = 8400;
        float outdolToRu = Converter.dolToRu(indolToRu);
        boolean passeddolToRu = expecteddolToRu == outdolToRu;
        float rubles2 = Converter.dolToRu(140);
        System.out.println("140 doolars are " + rubles2 + " rubles. Test result: " + passeddolToRu);
    }
}
