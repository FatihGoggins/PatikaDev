package Arrays;

public class ClosestMaxMin {
    public static void main(String[] args) {
        int[] noteList = {-100, 2, 125, 4, 8, 5, 12, -27};

        int target = 500;
        int closestMax = Integer.MAX_VALUE;
        int closestMin = Integer.MIN_VALUE;


        for (int i : noteList) {
            if (i <= target && i >= closestMin) {
                closestMin = i;
            }
            if (i >= target && i <= closestMax) {
                closestMax = i;
            }
        }
        if (closestMin == Integer.MIN_VALUE) {
            System.out.println("Bu listede girilen sayıdan daha küçük bir sayı yok.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın : " + closestMin);
        }

        if (closestMax == Integer.MAX_VALUE) {
            System.out.println("Bu listede girilen sayıdan daha büyük bir sayı yok.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın : " + closestMax);
        }
    }
}
