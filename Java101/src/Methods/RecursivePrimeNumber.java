package Methods;

import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
        if (isPrime(number, 2)) {
            System.out.printf("%d is a prime number.", number);
        } else {
            System.out.printf("%d is not a prime number.", number);
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return  n == 2 ? true : false;
        } else if (n % i == 0) {
            return false;
        } else if (i * i > n) {
            return true;
        }  else {
            return isPrime(n, i + 1);
        }
    }


}
