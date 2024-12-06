package org.kata;

import java.util.HashMap;

public class Herxample {
    public static void main(String[] args) {
        // Создание объекта HashMap
        HashMap<String, String> map = new HashMap<>();

        // Добавление элементов в HashMap
        map.put("apple", "fruit");
        map.put("carrot", "vegetable");
        map.put("banana", "fruit");

//        // Получение значения по ключу
//        System.out.println("apple is a " + map.get("apple")); // Output: apple is a fruit
//
//        // Проверка, существует ли ключ
//        if (map.containsKey("carrot")) {
//            System.out.println("Carrot is in the map!");
//        }
//
//        // Удаление элемента по ключу
//        map.remove("banana");

        // Печать всех пар ключ-значение
        for (String key : map.keySet()) {
            System.out.println(key + " TEST- " + map.get(key));
        }
    }
}
