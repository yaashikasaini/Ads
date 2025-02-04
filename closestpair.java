import java.util.Arrays;

public class closestpair {
    public static int[] findClosestPair(int[] arr, int target) {
        Arrays.sort(arr); 
        int left = 0, right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int pair1 = 0, pair2 = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
                pair1 = arr[left];
                pair2 = arr[right];
            }

            if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        return new int[]{pair1, pair2};
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int target = 54;
        int[] result = findClosestPair(arr, target);
        System.out.println("Closest Pair: " + result[0] + ", " + result[1]); 

        int[] arr2 = {1, 3, 4, 7, 10};
        target = 15;
        result = findClosestPair(arr2, target);
        System.out.println("Closest Pair: " + result[0] + ", " + result[1]); 
    }
}
