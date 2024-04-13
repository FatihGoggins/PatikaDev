package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        long number = scanner.nextLong();
        long tempNumber = number;
        long armstrongNumber = 0;
        int digitNumber = 0;
        long digitSum = 0;

        while (number >= Math.pow(10, digitNumber)) {
            digitNumber++;
        }

        int digit;
        for (int i = 1; i <= digitNumber; i++) {
            digit = (int)tempNumber % 10;
            tempNumber = (tempNumber - digit)/10;
            armstrongNumber += Math.pow(digit,digitNumber);
            digitSum += digit;
        }
        if (armstrongNumber == number) {
            System.out.printf("%d bir Armstrong Sayısıdır.\n", number);
        } else {
            System.out.printf("%d bir Armstrong Sayısı DEĞİLDİR.\n", number);
        }

        System.out.printf("Basamak rakamları toplamı: %d", digitSum);
    }
}
