package Arrays;

public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] list = {3, 4, 2, 4, 5, 3, 6, 8, 2, 8, 12, 4, 12, 13, 12};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                int temp = list[i];
                if ((i != j) && (temp == list[j]) && temp % 2 == 0) {
                    if (!isFound(duplicate, temp)) {
                        if (startIndex == 0) {
                            System.out.print("[" + temp);
                        } else {
                            System.out.print(", " + temp);
                        }
                        duplicate[startIndex++] = temp;
                    }
                    break;
                }
            }
        }
        System.out.print("]");

    }
    public static boolean isFound(int[ ] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
