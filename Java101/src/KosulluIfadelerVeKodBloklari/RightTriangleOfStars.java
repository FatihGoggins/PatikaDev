package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class RightTriangleOfStars {
    public static void main(String[] args) {
        int stepsLength;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        stepsLength = scanner.nextInt();
        System.out.println("");
        for (int i = stepsLength - 1; i >= 0 ; i--) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
