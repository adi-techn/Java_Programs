
public class tilling{
     public static int tillingProb(int n){
         if(n==0 || n==1){
             return 1;
         }
         return tillingProb(n-1)+tillingProb(n-2);
     }
     public static void main(String[] args) {
         System.out.println(tillingProb(4));
     }
 }
 
 
 