package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\n5 - Mod");
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                System.out.printf("Bölüm: %.3f", n1 / (float)n2);
                break;
            case 5:
                System.out.println("Modu: " + (n1 % n2));
        }
    }
}
