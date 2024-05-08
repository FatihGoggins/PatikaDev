package Arrays;

import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(list));
        int[] resultArray = new int[list.length];
        int outerCounter = 0;
        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            int count = 0;
            if (!isFound(resultArray, temp)) {
                for (int j = 0; j < list.length; j++) {
                    if (temp == list[j]) {
                        count++;
                    }
                }
                System.out.println(temp + " sayısı " + count + " kere tekrar edildi.");
            resultArray[outerCounter++] = temp;
            }

        }
    }

    public static boolean isFound(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return  false;
    }
}
