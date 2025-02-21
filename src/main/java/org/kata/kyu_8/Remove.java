package org.kata.kyu_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Remove {
    static String remove(String s) {
        return s.replaceAll("!", "").concat("!");

        /*String[] x = s.split("");
        String z = Arrays.stream(x)
                .filter(symbol -> !symbol.equals("!"))
                .collect(Collectors.joining(""));
        System.out.println(z);
        return z + "!";*/
    }

    public static void main(String[] args) {
        System.out.println(remove("!a!!!!!!!s!!d!!!!"));
    }
}
