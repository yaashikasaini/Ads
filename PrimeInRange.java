public class PrimeInRange {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  
        for (int i = 2; i * i <= num; i++) {  
            if (num % i == 0) {
                return false;  
            }
        }
        return true; 
    }
  
    public static int countPrimesInRange(int L, int R) {
        int count = 0;
       
        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {  
                count++;
            }
        }
        return count;  
    }

  
    public static void main(String[] args) {
        
        int L1 = 10, R1 = 30;
        System.out.println("Number of primes between " + L1 + " and " + R1 + ": " + countPrimesInRange(L1, R1));

        int L2 = 1, R2 = 50;
        System.out.println("Number of primes between " + L2 + " and " + R2 + ": " + countPrimesInRange(L2, R2));
    }
}
