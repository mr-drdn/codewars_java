package org.kata.kyu_8;

public class TwiceAsOld {

//    Вычислите, сколько лет назад отец был вдвое старше своего сына
//    (или сколько лет спустя он будет вдвое старше).
//    Ответ всегда больше или равен 0, независимо от того, было это в прошлом или в будущем.

    public static int twiceAsOld(int dadYears, int sonYears) {
        if (dadYears >= sonYears * 2) {
            return dadYears - (sonYears * 2);
        }
        return sonYears * 2 - dadYears;
    }
}


/*
//    стандартный метод в Java, который возвращает абсолютное значение числа (модуль). То есть Math.abs(5) = 5, Math.abs(-3) = 3.

    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - 2 * sonYears);
    }
*/
