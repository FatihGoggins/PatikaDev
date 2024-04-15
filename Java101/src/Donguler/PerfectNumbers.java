package Donguler;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();

        for (int n = 1; n < number; n++) {
            if (number % n == 0) sum += n;
            if (number / (float)n == 2.0) break;
        }
        if (number == sum) {
            System.out.printf("%d mükemmel bir sayıdır.", number);
        } else {
            System.out.printf("%d mükemmel bir sayı değildir.", number);
        }
    }
}
