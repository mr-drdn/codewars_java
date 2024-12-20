package coderun;

import java.io.*;
import java.util.*;

/*Условие
155. Уникальные элементы
Лёгкая

Задан массив a размера n. Необходимо посчитать количество уникальных элементов в данном массиве.
Элемент называется уникальным, если встречается в массиве ровно один раз.
Формат ввода

В первой строке входных данных подается одно целое число nn (1≤n≤1051≤n≤105).
Во второй строке входных данных подается nn целых чисел, разделенных пробелами −− a1a1​, a2a2​, ……, anan​ (1≤ai≤1091≤ai​≤109).
Формат вывода
В единственной строке выведите ответ на задачу.*/

public class UniqueElement {
    public static void uniqueElement(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("Задайте длину массива:");

        int n = Integer.parseInt(reader.readLine());
        System.out.println("n = " + n);

        String inputNumbers = reader.readLine();
        // Работать с этим массивом
        String[] numbers = inputNumbers.split(" ");
        if (numbers.length != n) {
            System.out.printf("Отказано\nВ массиве должно быть количество чисел: %d. Числа вводить через пробел", n);
            return;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        System.out.println("\nfrequencyMap = " + frequencyMap);

        System.out.println("frequencyMap.entrySet()       " + frequencyMap.entrySet());

        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }


        /*List<Integer> uniqueNumbers = new ArrayList<>();
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            if (Collections.frequency(Arrays.asList(numbers), num) == 1) {
                uniqueNumbers.add(number);
            }
        }

        var length = uniqueNumbers.size();*/

        /*int uniqueCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i].equals(numbers[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }*/

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("uniqueNumbers = " + (uniqueNumbers));
        var length = uniqueNumbers.size();
        System.out.println("length = " + (length));

        writer.write(String.valueOf(length));
        writer.newLine();

        reader.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        UniqueElement.uniqueElement(args);
    }
}
