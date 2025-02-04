public class question459 {
   
        public static boolean repeatedSubstringPattern(String s) {
            String doubled = s + s;
            return doubled.substring(1, doubled.length() - 1).contains(s);
        }
    
        public static void main(String[] args) {
            System.out.println(repeatedSubstringPattern("abab")); 
            System.out.println(repeatedSubstringPattern("abc"));  
            System.out.println(repeatedSubstringPattern("abcabcabcabc")); 
        }
    }
    
