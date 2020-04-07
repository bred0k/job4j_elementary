package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = (login);
        boolean access = root.equals("Jenya");
        return access;

    }


    public static void main(String[] args) {
        boolean userHasAccess = StringEq.check("Jenya");
        System.out.println("userHasAccess");
    }
}

