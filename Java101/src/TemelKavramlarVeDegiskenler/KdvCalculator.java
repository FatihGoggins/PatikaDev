package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        int moneyWithoutKDV = input.nextInt();
        float kdvPercent;
        if( moneyWithoutKDV > 0 && moneyWithoutKDV <= 1000) {
            kdvPercent= 0.18f;
        } else  {
            kdvPercent = 0.08f;
        }
        float kdvAmount = kdvPercent * moneyWithoutKDV;
        float moneyWithKDV = moneyWithoutKDV + kdvAmount;
        System.out.println("KDV'siz Fiyat: " + moneyWithoutKDV + " TL");
        System.out.println("KDV'li Fiyat: " +moneyWithKDV + " TL");
        System.out.println("KDV Tutarı: " + kdvAmount + " TL");


    }
}
