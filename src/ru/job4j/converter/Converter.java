package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rs2 = value / 60;
        return rs2;
    }

    public static void main(String[] args) {

        {
            int euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
            int in = 140;
            int expected = 2;
            int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result : " + passed);

        }

        {
            int dollar = Converter.rubleToDollar(140);
            System.out.println("140 rubles are " + dollar + " dollar.");
            int in = 150;
            int expected = 2;
            int out = rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result : " + passed);
        }
    }
}

