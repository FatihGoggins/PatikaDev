package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();
        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        int cumulativeSum = mat + fizik + kimya + turkce + tarih + muzik;
        double average = cumulativeSum / 6;
        System.out.println("Genel Not Ortalaması: " + average);
        if (average < 60 && average >= 0) {
            System.out.println("Sınıfta Kaldı");
        } else if (average >= 60 && average <= 100) {
            System.out.println("Sınıfı Geçti");
        }
    }
}
