package TemelKavramlarVeDegiskenler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("1. kenar uzunluğu (m): ");
        a = input.nextInt();
        System.out.print("2. kenar uzunluğu (m): ");
        b = input.nextInt();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        String formattedValue = df.format(c);
        System.out.println("Hipotenüs Uzunluğu " + formattedValue + " m");
    }
}
