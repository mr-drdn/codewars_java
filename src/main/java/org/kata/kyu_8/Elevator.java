package org.kata.kyu_8;

/*Задача: В здании с двумя лифтами (названными "левый" и "правый")
и тремя этажами (нумерация от 0 до 2) нужно написать функцию, которая принимает три аргумента:
left - текущий этаж левого лифта,
right - текущий этаж правого лифта,
call - этаж, с которого был вызван лифт.
Функция должна возвращать название ближайшего лифта к вызванному этажу ("left" или "right").

Если оба лифта находятся на одинаковом расстоянии от вызванного этажа, нужно выбрать правый лифт.

Все входные данные гарантированно будут целыми числами в диапазоне от 0 до 2.*/
public class Elevator {
    public static String call(int left, int right, int call) {
        int leftDistance = Math.abs(call - left);
        int rightDistance = Math.abs(call - right);

        return leftDistance < rightDistance ? "left" : "right";
    }

    public static void main(String[] args) {
        System.out.println(call(0, 0, 0));
        System.out.println(call(0, 1, 0));
        System.out.println(call(0, 2, 0));
    }
}
