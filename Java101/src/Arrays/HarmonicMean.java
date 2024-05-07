package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin uzunluğu = ");
        int length = scanner.nextInt();
        int[] newArray = new int[length];
        double harmonicSum = 0;
        double mean;
        for (int i = 0; i < length; i++) {
            System.out.print("1. eleman: ");
            int value = scanner.nextInt();
            newArray[i] = value;
            harmonicSum += 1.0 / value;
        }
        mean = length/harmonicSum;
        System.out.printf("%s dizisinin harmonik ortalaması: %.4f", Arrays.toString(newArray), mean);
    }
}
