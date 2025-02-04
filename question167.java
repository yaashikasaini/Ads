import java.util.Arrays;

public class question167 {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new question167().twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Numbers are: " + nums[result[0] - 1] + " + " + nums[result[1] - 1]);
        } else {
            System.out.println("No result found");
        }
    }
}
