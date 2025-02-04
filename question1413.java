public class question1413 {
    
        public int minStartValue(int[] nums) {
            int currentSum = 0;
            int minSum = 0;
    
            for (int num : nums) {
                currentSum += num;
                minSum = Math.min(minSum, currentSum);
            }
    
            return minSum < 0 ? 1 - minSum : 1;
        }
    
        public static void main(String[] args) {
            question1413 solution = new question1413();
            
            System.out.println(solution.minStartValue(new int[]{-3, 2, -3, 4, 2})); 
           
            System.out.println(solution.minStartValue(new int[]{1, 2})); 
    
            System.out.println(solution.minStartValue(new int[]{1, -2, -3})); 
        }
    }
    
