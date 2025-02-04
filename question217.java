import java.util.HashSet;
public class question217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1)); 

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); 

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3)); 
    }
}


