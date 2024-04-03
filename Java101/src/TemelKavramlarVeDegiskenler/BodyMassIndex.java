package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz (m): ");
        float height = input.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz (kg): ");
        float weight = input.nextFloat();
        double BMI = weight / Math.pow(height, 2);
        System.out.printf("Vücut Kitle İndeksiniz: %.4f", BMI);
    }
}
