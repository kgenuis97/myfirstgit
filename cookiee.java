import java.util.*;
class cookiee{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long s=0;
        int i=1;
		int s1;
        if(n>=1&&m<=Math.pow(10,9)){
            
            if(m>n){
         s1=m%n;
		 s=n-s1;
		 
            }
          
            else
                s=n-m;
             System.out.println(s);
		}
        } 
}