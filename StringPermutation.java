public class StringPermutation {
    public static void generateper(String str, String per) {

        if(str.isEmpty()){
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            generateper(rem,per+ch);

        }
    }
    public static void main(String[] args){
        String str="abc";
        System.out.println("Permutation of "+str+" is: ");
        generateper(str,"");
    }
}
