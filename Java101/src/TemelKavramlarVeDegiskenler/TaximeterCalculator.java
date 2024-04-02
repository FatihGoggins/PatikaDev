package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz (km): ");
        int km = input.nextInt();
        double perKm = 2.20;
        double total = perKm * km + 10;
        if (total < 20) {
            total = 20;
        }
        System.out.printf("Ödenecek tutar: " + total + " TL");
    }
}
