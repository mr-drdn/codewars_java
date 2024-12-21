package org.kata.kyu_8;

public class BooleanToString {
    public static String convert(boolean b) {
//  Универсальный метод, подходит для любых типов
//        return String.valueOf(b);
//  Для работы с типом boolean
        return Boolean.toString(b);
    }

    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println((convert(true)).getClass().getSimpleName());
    }
}
