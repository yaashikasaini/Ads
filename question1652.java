public class question1652 {
    
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] result = new int[n];
            
            
            if (k == 0) {
                return result;
            }
            
            
            for (int i = 0; i < n; i++) {
                int sum = 0;
                
                if (k > 0) {
                 
                    for (int j = 1; j <= k; j++) {
                        sum += code[(i + j) % n];
                    }
                } else if (k < 0) {
                    // Sum the previous k elements, wrapping around the array
                    for (int j = 1; j <= -k; j++) {
                        sum += code[(i - j + n) % n];  
                    }
                }
                
                result[i] = sum;
            }
            
            return result;
        }
    
        public static void main(String[] args) {
            question1652 solution = new question1652();
            
            // Test case 1
            int[] code1 = {5, 7, 1, 4};
            int k1 = 3;
            int[] result1 = solution.decrypt(code1, k1);
            System.out.println(java.util.Arrays.toString(result1)); 
    
            // Test case 2
            int[] code2 = {1, 2, 3, 4};
            int k2 = 0;
            int[] result2 = solution.decrypt(code2, k2);
            System.out.println(java.util.Arrays.toString(result2)); 
    
            // Test case 3
            int[] code3 = {2, 4, 9, 3};
            int k3 = -2;
            int[] result3 = solution.decrypt(code3, k3);
            System.out.println(java.util.Arrays.toString(result3)); 
        }
    }
    