public class maxsubarray{
   
        public static int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
    
            for (int num : nums) {
                currentSum += num;
                maxSum = Math.max(maxSum, currentSum);
                if (currentSum < 0) {
                    currentSum = 0; 
                }
            }
            return maxSum;
        }
        public static void main(String[] args) {
            int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println(maxSubArray(nums1)); 

            int[] nums2 = {1};
            System.out.println(maxSubArray(nums2));

            int[] nums3 = {5, 4, -1, 7, 8};
            System.out.println(maxSubArray(nums3)); 
        }
    
}
