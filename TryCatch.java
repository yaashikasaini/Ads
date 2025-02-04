public class TryCatch {
    
    public static void main(String[] args) {
        int a = 4;
        int b = 2; 
//using algorithm
        try {
            int que = a / b; 
            System.out.println(que);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }
}
