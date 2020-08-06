package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        int balance = money - price;
        for (int index = 0; index < COINS.length; index++){
            while (balance - COINS[index] >= 0){
                result[size] = COINS[index];
                balance = balance - COINS[index];
                size++;
                }
            }
        return Arrays.copyOf(result, size);
    }
    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println(Arrays.toString(machine.change(101, 73)));
    }
}
