package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        String month;
        int day;

        Scanner scanner = new Scanner(System.in);

        String horoscope = "";
        boolean isError = true;

        while (isError) {
            System.out.print("Doğduğunuz Ay (Ocak, Şubat...): ");
            month = scanner.next().toLowerCase();
            System.out.print("Doğduğunuz Gün: ");
            day = scanner.nextInt();

            if (month.equals("ocak")) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Oğlak";
                    } else {
                        horoscope = "Kova";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("şubat")) {
                if (day >= 1 && day <= 28) {
                    if(day < 20) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("mart")) {
                if (day >= 1 && day <= 31) {
                    if ( day < 21) {
                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("nisan")) {
                if ( day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("mayıs")) {
                if ( day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("haziran")) {
                if ( day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("temmuz")) {
                if ( day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("ağustos")) {
                if ( day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("eylül")) {
                if ( day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("ekim")) {
                if ( day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("kasım")) {
                if ( day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else if (month.equals("kasım")) {
                if ( day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                    isError = false;
                } else {
                    isError = true;
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.println("Hatalı bir gün yada ay girdiniz. Yeniden deneyiniz...");
            } else {
                month = month.substring(0, 1).toUpperCase() + month.substring(1);
                System.out.printf("%d %s: %s Burcu", day, month, horoscope);
            }
        }

    }
}
