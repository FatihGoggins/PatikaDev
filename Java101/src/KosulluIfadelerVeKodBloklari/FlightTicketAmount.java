package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class FlightTicketAmount {
    public static void main(String[] args) {

        int flightDistance = 0;
        int customerAge = 0;
        int flightType = 0;
        float flightTicket;
        float moneyPerKm = 0.10f; // TL
        float ageDiscount = 0;
        float flightTypeDiscount = 0;

        Scanner scanner = new Scanner(System.in);
        boolean isError = true;

        while (isError) {
            System.out.print("Mesafeyi km türünden giriniz: ");
            flightDistance = scanner.nextInt();
            if (flightDistance <= 0 ) {
                System.out.println("Mesafeyi HATALI girdiniz!!!");
            } else {
                isError = false;
            }
        }

        isError = true;

        while (isError) {
            System.out.print("Yaşınızı giriniz: ");
            customerAge = scanner.nextInt();
            if (customerAge <= 0 ) {
                System.out.println("Yaşınızı HATALI girdiniz!!!");
            } else {
                isError = false;
            }
        }

        isError = true;

        while (isError) {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Yönü): ");
            flightType = scanner.nextInt();
            if (flightType != 1 && flightType != 2) {
                System.out.println("Yolculuk tipini HATALI girdiniz!!!");
            } else {
                isError = false;
            }
        }

        flightTicket = flightDistance * moneyPerKm;

        if (customerAge < 12) {
            ageDiscount = 0.5f * flightTicket;
        } else if (customerAge <= 24) {
            ageDiscount = 0.1f * flightTicket;
        } else if (customerAge > 65) {
            ageDiscount = 0.3f * flightTicket;
        }

        flightTicket -= ageDiscount;

        if (flightType == 2) {
            flightTypeDiscount = 0.2f * flightTicket;
            flightTicket = (flightTicket - flightTypeDiscount) * 2;
        }

        System.out.printf("Bilet Fiyatı: %.2f", flightTicket);
    }
}
