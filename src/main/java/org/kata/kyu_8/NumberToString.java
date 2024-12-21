package org.kata.kyu_8;

public class NumberToString {
    public static String numbertoString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        System.out.println(numbertoString(6));
        System.out.println((numbertoString(6)).getClass().getSimpleName());
    }
}
