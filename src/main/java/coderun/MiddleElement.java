package coderun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// Условие
/*1. Средний элемент
Лёгкая

Рассмотрим три числа aa, bb и cc. Упорядочим их по возрастанию.
Какое число будет стоять между двумя другими?
Решение этой задачи на С++ могло бы выглядеть так:
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int a[3];
    for (int i = 0; i < 3; ++i) cin >> a[i];
    sort(a, a + 3);
    cout << a[1] << endl;
    return 0;
}
Формат ввода
В единственной строке записаны три целых числа aa, bb, cc (−1000≤a,b,c≤1000−1000≤a,b,c≤1000), числа разделены одиночными пробелами.
Формат вывода
Выведите число, которое будет стоять между двумя другими после упорядочивания.*/

public class MiddleElement {
    public static void middleElement(String[] args) throws IOException {

        System.out.println("Напиши три числа через пробел в строке ниже:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int middle = numbers[1];

        writer.write(String.valueOf(middle));
        writer.newLine();

        reader.close();
        writer.close();
    }


    public static void main(String[] args) throws IOException {
        MiddleElement.middleElement(args);
    }
}
