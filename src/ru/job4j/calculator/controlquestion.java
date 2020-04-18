package ru.job4j.calculator;

public class controlquestion {
    public static boolean sort(int[] array) {   //проверка на сортировку
        boolean result = true;
        for (int index = 1; index < array.length; index++) {
            if (array[index - 1] > array[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int comp(int[] array1, int[] array2) {   //поиск общих значений индексов
        int result1 = 1;
        for (int index = 0; index < array2.length; index++) {
            if (array1[index] == array2[index]) {
                result1 = index;
                System.out.println("indexes of common values: " + result1);
            }
        }
        return result1;

    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 8, 5};// ввод на сортировку
        {
            boolean result = controlquestion.sort(array);
            System.out.println("array sort " + result);
        }
        {
            int[] array1 = new int[]{1, 2, 8, 8, 5, 6}; //ввод на поиск общих значений индексов
            int[] array2 = new int[]{1, 4, 3, 7, 5, 6};
            int result1 = controlquestion.comp(array1, array2);

        }
    }
}









