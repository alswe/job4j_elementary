package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rouble = 200;

        int euro = Converter.rubleToEuro(rouble);
        System.out.println(rouble + " rubles are " + euro + " euro.");

        int usd = Converter.rubleToDollar(rouble);
        System.out.println(rouble + " rubles are " + usd + " USD.");
    }
}
