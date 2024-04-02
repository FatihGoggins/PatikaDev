package TemelKavramlarVeDegiskenler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircularCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Dairenin Yarıçapı (m): ");
        int radius = input.nextInt();
        double PI = 3.14;
        double area = PI * Math.pow(radius, 2);
        double perimeter = 2 * PI * radius;
        System.out.printf("Dairenin Çevresi: %.2f m\n", perimeter);
        System.out.printf("Dairenin Alanı: %.2f m^2", area);
    }
}
