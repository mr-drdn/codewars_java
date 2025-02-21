package org.kata.kyu_8;

public class ReplaceAllVowel {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static void main(String[] args) {
        var x = "Kinskaya SALUPA";
        System.out.println(replace(x));
    }
}



