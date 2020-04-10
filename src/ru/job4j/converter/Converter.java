/**
* Converter
*/
package ru.job4j.converter;

/** *Class Converter решение задачи  Конвертер валюты
 * @evgenyi bykanov
 * @since  10.04.2020
 * @version  1
 */


public class Converter {
    /**
     * Вычичисление колличества евро
	 * Method rubleToEuro
     * @param value
     * @return rs1
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Вычисление колличества долларов
	 * Method rubleToDollar
     * @param value
     * @return rs2
     */

    public static int rubleToDollar(int value) {
        int rs2 = value / 60;
        return rs2;
    }

    /**
     * Main
     * @param args -agrs
     */
    public static void main(String[] args) {
        

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


