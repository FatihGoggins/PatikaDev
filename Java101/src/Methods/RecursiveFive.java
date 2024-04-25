package Methods;

import java.util.Scanner;

public class RecursiveFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber, limit;
        System.out.print("N sayısı: ");
        startNumber = scanner.nextInt();
        limit = startNumber;
        recursion(startNumber, false, limit);

    }
    public static int recursion(int number, boolean didExceedZero, int limit) {
        if (!didExceedZero && number > 0) {
            System.out.print(number + " ");
            return recursion(number - 5, didExceedZero, limit);
        } else if (number < limit) {
            System.out.print(number + " ");
            return  recursion(number + 5,true, limit);
        } else {
            System.out.print(number);
            return 0;
        }
    }

}
