package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int length = scanner.nextInt();

        for (int i = 0; i < length;i++) {
            for (int j = 1; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < length - 1;i++) {
            for (int j = 0; j <= i; j++ ) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * (length - (i + 1)) ;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
