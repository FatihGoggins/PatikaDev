package Methods;

import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        String resultText = "";
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            } else {
                resultText += number + " + ";
            }
            result += number;
        }
        resultText = resultText.substring(0, resultText.length() - 3);
        System.out.println(resultText + " = " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        int number, result = 0;
        String resultText = "";

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();

            //1 sayı varsa, 1 = 0;
            // 2 sayı varsa, 1 - 2 = -1;
            if (i == 1) {
                result += number;
                resultText += number;
            } else {
                result -= number;
                resultText += " - " + number;
            }

        }
        System.out.println(resultText + " = " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        String resultText = "";

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();

            if (number == 1) {
                resultText += number;
                break;
            } else if (number == 0) {
                result *= 0;
                resultText += number;
                break;
            } else {
                resultText += number + " * ";
                result *= number;
            }
        }

        System.out.println(resultText + " = " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.printf("%d ^ %d = %d\n", base, exponent, result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
    }

     static void modulo() {
         Scanner scan = new Scanner(System.in);
         System.out.print("Modu alınacak sayı: ");
         int divided = scan.nextInt();
         System.out.print("Kaça göre modu: ");
         int divider = scan.nextInt();
         int mod = divided % divider;
         System.out.printf("%d %% %d = %d\n", divided, divider, mod);
     }

     static void rectangle() {
         Scanner scan = new Scanner(System.in);
         System.out.print("Kısa Kenar: ");
         int shortEdge = scan.nextInt();
         System.out.print("Uzun Kenar: ");
         int longEdge = scan.nextInt();
         System.out.printf("Dikdörtgenin Alanı: %d\n", longEdge * shortEdge);
         System.out.printf("Dikdörtgenin Çevresi: %d\n", 2 * (longEdge + shortEdge));
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}