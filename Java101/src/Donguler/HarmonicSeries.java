package Donguler;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        long n = scanner.nextLong();
        double seriesSum = 0;

        for (long i = 1; i<=n; i++) {
            seriesSum += 1/(double)i;
        }
        System.out.printf("Harmonik Seri toplamı = %f", seriesSum);
    }
}
