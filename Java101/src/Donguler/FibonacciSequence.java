package Donguler;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Giriniz: ");
        int step = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= step; i++) {
            int sum = n1 + n2;
            System.out.printf("%d + %d = %d\n", n1, n2, sum);
            n1 = n2;
            n2 = sum;
        }
    }


}
