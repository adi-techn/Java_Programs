public class Adam{
     public static void main(String[] args) {
         int n=12;
         int rev1=0,rev2=0;
         int sq=n*n;
         while(sq!=0){
             int r=sq%10;
             rev1=(rev1*10)+r;
             sq/=10;
         }
         int ans=(int)Math.sqrt(rev1);
         while (ans!=0) {
             int r=ans%10;
             rev2=rev2*10+r;
             ans/=10;
         }
         if(n==rev2){
             System.out.println("Adam number");
         }
         else{
             System.out.println("Not an adam number");
         }
     }
 }
 
