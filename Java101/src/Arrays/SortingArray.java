package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        int arrayLength = scanner.nextInt();
        int[] unsortedArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print((i + 1) + ". Eleman: ");
            unsortedArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (unsortedArray[j] < unsortedArray[i]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(unsortedArray));

    }

}
