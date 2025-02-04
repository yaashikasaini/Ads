public class question345 {
    
        public String reverseVowels(String s) {
            
            char[] arr = s.toCharArray();
            int left = 0, right = arr.length - 1;
            String vowels = "aeiouAEIOU";
          
            while (left < right) {
               
                if (!vowels.contains(arr[left] + "")) {
                    left++;
                }
                
                else if (!vowels.contains(arr[right] + "")) {
                    right--;
                }
                
                else {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            return new String(arr);
        }
    
        public static void main(String[] args) {
            question345 solution = new question345();
    
            // Test case 1
            String s1 = "IceCreAm";
            System.out.println(solution.reverseVowels(s1));  
            // Test case 2
            String s2 = "leetcode";
            System.out.println(solution.reverseVowels(s2));  
        }
    }

