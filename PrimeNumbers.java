public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void printPrimes(int N) {
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

 
    public static void main(String[] args) {
        int N1 = 10;
        System.out.print("Prime numbers from 1 to " + N1 + ": ");
        printPrimes(N1);  

        System.out.println(); 

        int N2 = 5;
        System.out.print("Prime numbers from 1 to " + N2 + ": ");
        printPrimes(N2);  
    }
}
