public class TowersofHanoi {
    public static void solved(int n,char source, char rod, char desti){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to"+desti );
            return;
        }
        solved(n-1,source,desti,rod);
        System.out.println("Move disk "+n+" from "+source+" to "+desti);
        solved(n-1,rod,source,desti);

    }
    public static void main(String[] args) {
        int m=4;
        solved(m, 'n', 'o', 'd');
    }
}
