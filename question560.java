import java.util.HashMap;
public class question560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int runningSum = 0;
        int result = 0;
        for (int num : nums) {
            runningSum += num;
            if (map.containsKey(runningSum - k)) {
                result += map.get(runningSum - k);
            }
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
          return result;
    }

    public static void main(String[] args) {
        question560 solution = new question560();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(solution.subarraySum(nums1, k1));  
        
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(solution.subarraySum(nums2, k2));  
    }
}
