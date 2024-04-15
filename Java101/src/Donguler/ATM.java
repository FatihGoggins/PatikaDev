package Donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int rights = 3;
        int balance = 1500;
        int selection;
        while (rights > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = scanner.nextLine();
            System.out.print("Parolanız: ");
            password = scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("\nMerhabalar! KARAOGLU Store'a hoş geldiniz...\n");
                do {
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz: ");
                    selection = scanner.nextInt();
//                    if (selection == 1) {
//                        System.out.print("Para miktarı: ");
//                        int price = scanner.nextInt();
//                        balance += price;
//                        System.out.printf("\nYatırılan para: %d\nToplam Bakiyeniz: %d\n\n", price, balance);
//                    } else if (selection == 2) {
//                        System.out.print("Para miktarı: ");
//                        int price = scanner.nextInt();
//                        if (balance >= price) {
//                            balance -= price;
//                            System.out.printf("\nÇekilen para: %d\nKalan Bakiyeniz: %d\n\n", price, balance);
//                        } else {
//                            System.out.println("\nBakiyeniz yetersiz.\n\n");
//                        }
//                    } else if (selection == 3) {
//                        System.out.printf("Toplam Bakiyeniz: %d\n\n", balance);
//                    } else {
//                        System.out.println("Geçersiz işlem isteği. Lütfen tekrar deneyiniz.\n");
//                    }
                    int price;
                    switch (selection) {

                        case 1:
                            System.out.print("Para miktarı: ");
                            price = scanner.nextInt();
                            balance += price;
                            System.out.printf("\nYatırılan para: %d\nToplam Bakiyeniz: %d\n\n", price, balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = scanner.nextInt();
                            if (balance >= price) {
                                balance -= price;
                                System.out.printf("\nÇekilen para: %d\nKalan Bakiyeniz: %d\n\n", price, balance);
                            } else {
                                System.out.println("\nBakiyeniz yetersiz.\n");
                            }
                            break;
                        case 3:
                            System.out.printf("Toplam Bakiyeniz: %d\n\n", balance);
                            break;
                        default:
                            System.out.println("Geçersiz işlem isteği. Lütfen tekrar deneyiniz.\n");
                            break;
                    }
                } while (selection != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                rights--;
                System.out.println("\nHatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (rights == 0) {
                    System.out.println("\nHesabınız güvenlik önlemleri nedeniyle bloke edilmiştir. Lütfen bankayla iletişime geçin.");
                } else {
                    System.out.printf("Kalan hakkınız: %d\n\n", rights);
                }
            }
        }

    }
}
