package Donguler;

import java.util.Scanner;

public class ThreeFourAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int userInput = scanner.nextInt();
        int counter = 0;
        int total = 0;
        float average;
        for (int n = 1; n <= userInput; n++ ) {
            if (n % 3 == 0 || n % 4 == 0) {
                total+= n;
                counter++;
            }
        }
        average = total / (float) counter;
        System.out.printf("Ortalama: %.3f", average);

    }
}
