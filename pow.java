public class pow{
     public static double myPow(double x, int n) {
         int m=n;
         if(n==0){
             return 1;
         }
         if(m<0){
             n*=(-1);
             double p=x*myPow(x, n-1);
             return 1/p;
         }
         double p=x*myPow(x, n-1);
         return p;
     }
     public static void main(String[] args) {
         System.out.println(myPow(2.00, -200000000));
     }
 }