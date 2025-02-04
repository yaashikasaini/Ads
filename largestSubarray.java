import java.util.HashMap;
public class largestSubarray {
    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int prefixSum = 0; 
        int maxLength = 0; 
        sumMap.put(0, -1);
       
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (sumMap.containsKey(prefixSum)) {
                int length = i - sumMap.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                sumMap.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    
    public static void main(String[] args) {
        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr1));  
        
        int[] arr2 = {2, 10, 4};
        System.out.println(maxLen(arr2));  
        
        int[] arr3 = {1, 0, -4, 3, 1, 0};
        System.out.println(maxLen(arr3));  
    }
}
