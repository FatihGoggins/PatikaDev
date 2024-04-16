package Methods;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int userInput = scanner.nextInt();
        int tempNumber = userInput;
        int counter = 0;
        String palindrome = "";
        String userInputStr = Integer.toString(userInput);

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            tempNumber = (tempNumber - digit) / 10;
            palindrome += digit;
        }

        if (palindrome.equals(userInputStr)) {
            System.out.printf("%d bir Palindrom sayısıdır.", userInput);
        } else {
            System.out.printf("%d bir Palindrom sayısı değildir.", userInput);
        }
    }

}
