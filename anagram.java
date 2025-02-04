
public class anagram{
        public static boolean areAnagrams(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            int[] count = new int[26];
            for (char c : s1.toCharArray()) count[c - 'a']++;
            for (char c : s2.toCharArray()) {
                if (--count[c - 'a'] < 0) return false;
            }
            return true;
        }
    public static void main(String[] args){
        String s2 = "anagram";
            String s3 = "nagaram";
            System.out.println("Are Anagrams: " + areAnagrams(s2, s3));
    }
    }

