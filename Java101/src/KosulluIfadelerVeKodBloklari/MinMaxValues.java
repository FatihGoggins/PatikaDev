package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class MinMaxValues {
    public static void main(String[] args) {
        int length, max, min, counter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        length = scanner.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        int n1 = scanner.nextInt();
        max = n1;
        min = n1;
        for (int i = 0; i < length - 1; i++) {
            System.out.printf("%d. sayıyı giriniz: ", i+2);
            int tempNumber = scanner.nextInt();
            if (tempNumber >= max) {
                max = tempNumber;
            }
            if (tempNumber <= min) {
                min = tempNumber;
            }
        }
        System.out.printf("min = %d\nmax = %d", min, max);
    }
}
