package org.kata.kyu_8;

public class Converter {
    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);
    }

    public static void main(String[] args) {
        System.out.println("Результат ковертирования строки '1001001' в десятичную систему: " + (binToDecimal("1001001")));
    }
}
