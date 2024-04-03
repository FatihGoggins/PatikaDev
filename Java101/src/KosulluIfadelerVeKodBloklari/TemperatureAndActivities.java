package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class TemperatureAndActivities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığı: ");
        int temperature = input.nextInt(); // In Celsius
        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (temperature < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (temperature >= 10 && temperature < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if (temperature >= 25) {
            System.out.println("YÜzmeye gidebilirsiniz.");
        }

    }
}
