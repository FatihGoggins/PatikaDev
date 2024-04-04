package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if(year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else if(year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.printf("%d bir artık yıldır!", year );
        } else {
            System.out.printf("%d bir artık yıl değildir!", year );
        }
    }
}
