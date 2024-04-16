package Methods;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Giriniz: ");
        int step = scanner.nextInt();

        System.out.printf("Fibonacci Serisi: %d", fibonacci(step - 1));
    }

    public static int fibonacci(int number) {
        if (number <= 1 ) {
            return  number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
