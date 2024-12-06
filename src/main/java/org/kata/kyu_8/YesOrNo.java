package org.kata.kyu_8;

public class YesOrNo {
    //    Завершите метод, который принимает логическое значение
//    и возвращает строку "Yes" для true или строку "No" для false.
    public static String boolToWord(boolean boolValue) {
        return boolValue ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }
}
