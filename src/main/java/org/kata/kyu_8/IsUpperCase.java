package org.kata.kyu_8;

public class IsUpperCase {
    public static boolean isUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                return false;
            }
            if (Character.isDigit(c))
                return false;
        }
        return true;
    }

    /*public static boolean isUpperCase(String s){
        return s.equals(s.toUpperCase());
    }*/

    public static void main(String[] args) {
        System.out.println(isUpperCase("a"));
    }
}
