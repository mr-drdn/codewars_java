package org.kata.kyu_8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FuelPrice {
    /*В этом задании нужно написать функцию, которая принимает два аргумента:
    litres (количество литров) и pricePerLitre (цена за литр в долларах).
    Условия:
    При покупке 2 или более литров предоставляется скидка 5 центов за литр.
    При покупке 4 или более литров предоставляется скидка 10 центов за литр.
    И так далее, каждые 2 литра скидка увеличивается на 5 центов за литр, но
    максимальная скидка не может превышать 25 центов за литр.

    Требуется:
    Рассчитать итоговую стоимость покупки с учетом скидки.
    Округлить результат до двух знаков после запятой.
    Гарантируется, что входные данные будут корректными (неотрицательные числа).
    Примечание: 1 доллар = 100 центов.*/
    public static double fuelPrice(int litres, double pricePerLitre) {
        return litres * (pricePerLitre - Math.min(litres / 2 * 0.05, 0.25));

        /*double discount = Math.min((Math.floor((double) litres / 2)) * 0.05, 0.25);
        double price = litres * (pricePerLitre - discount);

//        BigDecimal roundedResult = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
//        return roundedResult.doubleValue();
//        return price;
        return Math.round(price * 100.0) / 100.0;*/
    }

    public static void main(String[] args) {
        System.out.println(fuelPrice(5, 1.23));
        System.out.println(fuelPrice(8, 2.5));
        System.out.println(fuelPrice(5, 5.6));
    }
}

