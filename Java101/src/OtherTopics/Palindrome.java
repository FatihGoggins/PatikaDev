package OtherTopics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word = scanner.nextLine();
        int wordLength = word.length();
        boolean isPalindrome = true;

        for (int i = 0; i < wordLength; i++) {
            int leftLetter = word.charAt(i);
            int rightLetter = word.charAt(wordLength - 1 - i);
            if (leftLetter != rightLetter) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
