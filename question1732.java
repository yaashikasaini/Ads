public class question1732 {
        public int largestAltitude(int[] gain) {
            int currentAltitude = 0;
            int maxAltitude = 0;
            
            
            for (int g : gain) {
                currentAltitude += g;  
                maxAltitude = Math.max(maxAltitude, currentAltitude); 
            }
            
            return maxAltitude;  
        }
    
        public static void main(String[] args) {
            question1732 solution = new question1732();
    
        
            System.out.println(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7})); 
    
           
            System.out.println(solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})); 
        }
    }

