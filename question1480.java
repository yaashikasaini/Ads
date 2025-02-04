public class question1480 {

        public int[] runningSum(int[] nums) {
            
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    
        public static void main(String[] args) {
            question1480 solution = new question1480();
    
            
            int[] nums1 = {1, 2, 3, 4};
            System.out.println("Input: [1,2,3,4]");
            System.out.println("Output: " + java.util.Arrays.toString(solution.runningSum(nums1)));
    
           
            int[] nums2 = {1, 1, 1, 1, 1};
            System.out.println("Input: [1,1,1,1,1]");
            System.out.println("Output: " + java.util.Arrays.toString(solution.runningSum(nums2)));
    
          
            int[] nums3 = {3, 1, 2, 10, 1};
            System.out.println("Input: [3,1,2,10,1]");
            System.out.println("Output: " + java.util.Arrays.toString(solution.runningSum(nums3)));
        }
    }
    
