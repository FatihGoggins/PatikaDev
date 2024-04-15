package Donguler;

import java.util.Scanner;

public class TriangleOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length;i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
