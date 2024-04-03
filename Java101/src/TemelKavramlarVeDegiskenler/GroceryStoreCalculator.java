package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class GroceryStoreCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Armut (kg): ");
        int armut = input.nextInt();
        float armutPerKg = 2.14f;
        System.out.printf("Elma (kg): ");
        int elma = input.nextInt();
        float elmaPerKg = 3.67f;
        System.out.printf("Domates (kg): ");
        int domates = input.nextInt();
        float domatesPerKg = 1.11f;
        System.out.printf("Muz (kg): ");
        int muz = input.nextInt();
        float muzPerKg = 0.95f;
        System.out.printf("Patlıcan (kg): ");
        int patlican = input.nextInt();
        float patlicanPerKg = 5.00f;
        float total = armut * armutPerKg + elma * elmaPerKg + domates * domatesPerKg + muz * muzPerKg + patlican * patlicanPerKg;
        System.out.printf("Toplam Tutar: %.2f TL", total);

    }
}
