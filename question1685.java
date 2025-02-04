import java.util.Arrays;
public class question1685 {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n];

        // Compute prefix sum
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Compute result array
        for (int i = 0; i < n; i++) {
            int leftSum = i > 0 ? prefixSum[i - 1] : 0; // Sum of all elements to the left of nums[i]
            int rightSum = prefixSum[n - 1] - prefixSum[i]; // Sum of all elements to the right of nums[i]
            int leftCount = i; // Number of elements to the left of nums[i]
            int rightCount = n - i - 1; // Number of elements to the right of nums[i]

            result[i] = (nums[i] * leftCount - leftSum) + (rightSum - nums[i] * rightCount);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums1)));

        int[] nums2 = {1, 4, 6, 8, 10};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums2))); 
    }
}
