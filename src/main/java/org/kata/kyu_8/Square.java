package org.kata.kyu_8;

public class Square {
//    public static boolean isSquare(int n) {
//        if (n < 0) {
//            return false;
//        }
//        int sqt = (int) Math.sqrt(n);
//        return sqt * sqt == n;
//    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(Square.isSquare(9));
    }
}


