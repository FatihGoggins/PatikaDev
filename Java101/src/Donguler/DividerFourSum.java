package Donguler;

import java.util.Scanner;

public class DividerFourSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        boolean isDividable = true;

        while (isDividable) {
            System.out.print("Sayı giriniz: ");
            int number = scanner.nextInt();
            if(number % 2 == 1 || number % 2 == -1) {
                isDividable = false;
            } else {
                if (number % 4 == 0) {
                    sum += number;
                }
            }
        }
        System.out.printf("Toplam: %d", sum);
    }
}
