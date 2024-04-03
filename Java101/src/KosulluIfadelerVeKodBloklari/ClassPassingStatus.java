package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class ClassPassingStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[5];
        System.out.print("Türkçe Notunuz: ");
        int turkce = input.nextInt();
        System.out.print("Matematik Notunuz: ");
        int matematik = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        int fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        int kimya = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        int muzik = input.nextInt();

        int total = 0;
        total += (turkce >= 0 && turkce <= 100) ? turkce : 0;
        total += (matematik >= 0 && matematik <= 100) ? matematik : 0;
        total += (fizik >= 0 && fizik <= 100) ? fizik : 0;
        total += (kimya >= 0 && kimya <= 100) ? kimya : 0;
        total += (muzik >= 0 && muzik <= 100) ? muzik : 0;

        float average = total / 5f;
        if (average > 55) {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere");
        }
        System.out.printf("Genel Not Ortalamanız: %.1f", average);
    }
}
