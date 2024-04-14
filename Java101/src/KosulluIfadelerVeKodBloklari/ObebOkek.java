package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class ObebOkek {
    public static void main(String[] args) {
        int n1 ,n2, okek;
        int obeb = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayı: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci Sayı: ");
        n2 = scanner.nextInt();

        int counter = n1;

        while (counter > 0) {
            if (n1 % counter == 0 && n2 % counter == 0) {
                obeb = counter;
                break;
            }
            counter--;
        }
        okek = (n1 * n2) / obeb;
        System.out.printf("n1 = %d, n2 = %d\nOBEB = %d\nOKEK = %d",n1,n2,obeb,okek);
    }
}
