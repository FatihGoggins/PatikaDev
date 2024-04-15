package Donguler;


public class PrimeNumbers {
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.printf("%d ", n);
            }
        }
    }
    public static boolean isPrime (int number) {
        int counter = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 1) {
            return true;
        } else {
            return  false;
        }
    }
}
