package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "fatihkaraoglu";
        String password = "avanaklar123";
        System.out.print("Kullanıcı Adı: ");
        String userNameInput = input.next();
        System.out.print("Şifre: ");
        String passwordInput = input.next();
        if (!userNameInput.equals(userName)) {
            System.out.println("Sistemde kullanıcı adı " + userNameInput +" olan bir kullanıcı bulunmamaktadır.");
        } else if (userNameInput.equals(userName) && !password.equals(passwordInput)) {
            System.out.print("Hatalı şifre girişi. Şifrenizi değiştirmek ister misiniz? Y/N: ");
            String resetPassword = input.next();
            if (resetPassword.toLowerCase().equals("y")) {
                System.out.println("Yeni şifreniz hatalı girdiğiniz ve unuttuğunuz şifreyle aynı olmamalı!!!");

                boolean isNewPasswordActive = false;
                String newPassword;
                while (!isNewPasswordActive) {
                    System.out.print("Yeni Şifreniz: ");
                    newPassword = input.next();
                    if(newPassword.equals(passwordInput ) || newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                    } else {
                        System.out.print("Şifreniz oluşturuldu.");
                        isNewPasswordActive = true;
                    }
                }

            }
        } else {
            System.out.print("Giriş Yaptınız!");
        }
    }
}
