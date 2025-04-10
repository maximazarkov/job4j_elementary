package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + out + " euro.");
        System.out.println(in + " rubles are " + expected + " euro. Test result : " + passed);

        in = 120;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " rubles are " + out + " dollar.");
        System.out.println(in + " rubles are " + expected + " euro. Test result : " + passed);

        float a = 1.23f;
        double b = 4.56f;
        System.out.printf("%.15f%n", a);
        System.out.printf("%.15f%n", b);
    }
}
