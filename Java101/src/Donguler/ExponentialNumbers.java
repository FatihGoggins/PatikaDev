package Donguler;

import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        int number, power;
        long result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        number = scanner.nextInt();
        System.out.print("Üs alınacak sayı: ");
        power = scanner.nextInt();

        for (int i = 0; i< power; i++) {
            result *= number;
        }

        System.out.printf("Sonuç: %d", result);
    }
}
