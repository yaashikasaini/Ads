public class question26 {
   
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            int i = 0; 
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++; 
                    nums[i] = nums[j]; 
                }
            }
    
            return i + 1; 
        }
    
        public static void main(String[] args) {
            int[] nums1 = {1, 1, 2};
            int k1 = removeDuplicates(nums1);
            System.out.println("Output: " + k1 + ", nums = " + arrayToString(nums1, k1)); 
    
            int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            int k2 = removeDuplicates(nums2);
            System.out.println("Output: " + k2 + ", nums = " + arrayToString(nums2, k2)); 
        }
    
       
        private static String arrayToString(int[] nums, int length) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < length; i++) {
                sb.append(nums[i]);
                if (i < length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }  
}
