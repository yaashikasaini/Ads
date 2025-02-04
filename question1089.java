import java.util.Arrays;
public class question1089 {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--; 
                if (i + zeros < n) {
                    arr[i + zeros] = 0; 
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1)); 

        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2)); 
    }
}