package org.kata.kyu_8;

public class NoBoring {
    public static int noBoringZero(int n) {
        while (n % 10 == 0 && n != 0) {
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZero(146000));
    }
}
