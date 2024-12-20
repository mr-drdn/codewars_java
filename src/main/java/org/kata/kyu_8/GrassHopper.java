package org.kata.kyu_8;

import java.util.Arrays;

/*Найти среднее
Найдите среднее значение списка чисел в массиве.

Информация
Чтобы найти среднее значение набора чисел,
сложите все числа вместе и разделите на количество значений в списке.*/
public class GrassHopper {

    public static int findAverage(int[] nums) {
        //так пишут серьёзные пацаны
        //return (int)Arrays.stream(nums).average().orElse(0);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
    /*    for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            sum += nums[i];
        }

        return sum ;
    }*/


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        System.out.println(findAverage(arr));
    }
}