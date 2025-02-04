public class question2256 {
    
        public int minimumAverageDifference(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return 0;
            }
            int totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }
            int leftSum = 0;
            int minAvgDiff = Integer.MAX_VALUE;
            int resultIndex = -1;
            for (int i = 0; i < n; i++) {
                leftSum += nums[i];
                int rightSum = totalSum - leftSum;
                int leftAvg = leftSum / (i + 1);
                int rightAvg = (n - i - 1) > 0 ? rightSum / (n - i - 1) : 0; 
                int avgDiff = Math.abs(leftAvg - rightAvg);
                if (avgDiff < minAvgDiff) {
                    minAvgDiff = avgDiff;
                    resultIndex = i;
                }
            }
    
            return resultIndex;
        }
    
        public static void main(String[] args) {
            question2256 solution = new question2256();
    
            // Test case 1
            int[] nums1 = {2, 5, 3, 9, 5, 3};
            System.out.println(solution.minimumAverageDifference(nums1)); 
            // Test case 2
            int[] nums2 = {0};
            System.out.println(solution.minimumAverageDifference(nums2)); 
        }
    }