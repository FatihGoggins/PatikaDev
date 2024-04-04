package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class ChineseZodiacFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear;
        int modulo;
        String zodiacSign;

        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = scanner.nextInt();
        modulo = birthYear % 12;

        switch (modulo) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Cockerel";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
                zodiacSign = "None";
                break;
        }

        System.out.printf("Chinese Zodiac Sign: %s", zodiacSign);

    }
}
