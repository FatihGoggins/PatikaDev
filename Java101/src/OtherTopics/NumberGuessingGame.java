package OtherTopics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100);

        int attempts = 0;
        int selected;
        int[] falseAttempts = new int[5];
        boolean isWin = false;
        boolean isFalseAttempt = false;

        while (attempts < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isFalseAttempt) {
                    attempts++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - attempts));
                } else {
                    isFalseAttempt = true;
                    System.out.println("Bir daha ki hatalı girişinizde hakkınızdan düşülecektir!");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış tahmin!");
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                falseAttempts[attempts++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - attempts));
            }


        }
        if (!isWin) {
            System.out.println("Kaybettiniz!!!");
            System.out.println("Gizli Sayı: " + number);
            if (!isFalseAttempt) {
                System.out.println("Tahminleriniz: " + Arrays.toString(falseAttempts));
            }
        }
    }
}
