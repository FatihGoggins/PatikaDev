package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class PowerFourFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        long userInput = scanner.nextLong();
        int counter = 0;
        long powerFour = 0;
        long powerFive = 0;
        boolean isLower = true;
        while (isLower) {
            powerFour = (long) Math.pow(4, counter);
            powerFive = (long) Math.pow(5, counter);
            if (powerFive <= userInput && powerFour <= userInput) {
                System.out.printf("4^%d = %d, 5^%d = %d\n", counter, powerFour, counter, powerFive);
            } else if (powerFive > userInput && powerFour <= userInput) {
                System.out.printf("4^%d = %d\n", counter, powerFour);
            } else {
                isLower = false;
            }
            counter++;
        }
    }
}
