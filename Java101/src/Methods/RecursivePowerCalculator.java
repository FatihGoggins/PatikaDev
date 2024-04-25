package Methods;

import java.util.Scanner;

public class RecursivePowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int power = scanner.nextInt();

        System.out.println("Sonuç: " + exponential(base, power));

    }

    public static double exponential(int base, int power) {
        if (power == 0) {
            return 1;
        } else if (power <= 0) {
            return  exponential(base, power + 1) / (double) base;
        } else {
            return exponential(base, power - 1) * base;
        }
    }
}
