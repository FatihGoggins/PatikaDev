package Donguler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n;
        int r;
        long result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Formülasyon: C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("n = ");
        n = scanner.nextInt();
        System.out.print("r = ");
        r = scanner.nextInt();
        result = combinationCalc(n, r);
        System.out.printf("C(%d,%d) = %d", n, r, result);
    }

    public static long factorialCalc(int number) {
        if (number >= 1) {
            return factorialCalc(number - 1) * number;
        } else {
            return 1;
        }
    }

    public static long combinationCalc(int n, int r) {
        return factorialCalc(n) / (factorialCalc(r) * factorialCalc(n-r));
    }
}
