package org.kata.kyu_8;

public class FuelPrice {
    public static double fuelPrice(int litres, double pricePerLitre) {
        if (litres >= 2 && litres < 4) {
            return litres * pricePerLitre * 0.95;
        }
        return litres*pricePerLitre;
    }

    public static void main(String[] args) {
        System.out.println(fuelPrice(3, 20));
    }
}

