package org.kata.kyu_8;

import java.util.Arrays;

/*Создайте функцию с двумя аргументами, которая
будет возвращать массив первых n кратных числа x.
Предполагается, что как заданное число, так и
количество раз для подсчета будут положительными числами больше 0.
Верните результат в виде массива или списка (в зависимости от языка).
x = 1, n = 10 --> [1,2,3,4,5,6,7,8,9,10]
x = 2, n = 5  --> [2,4,6,8,10]
*/
public class CountBy {

    public static int[] countBy(int x, int n) {
        int[] array = new int[n];
        int count = x;
        for (int i = 0; i < n; i++) {
            array[i] = count;
            // count = count + x
            count += x;  // Увеличиваем на x
        }
        return array;
    }

/*    public static int[] countBy(int x, int n) {
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = (i + 1) * x;
        }
        return count;
    }*/


    public static void main(String[] args) {
        int[] result = countBy(2, 5);
        System.out.println(Arrays.toString(result));
    }
}


