package org.kata.kyu_8;

public class StringToNumber {
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("123"));
        System.out.println((stringToNumber("123")));
    }
}
