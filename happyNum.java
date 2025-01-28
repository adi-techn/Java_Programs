
public class happyNum{
     public static boolean happyNum(int n){
             int sum=0;
             int r,m;
             m=n;
             while (n>=4 && n<=500){
                 r=m%10;
                 sum+=r*r;
                 m/=10;
                 if(m==0){
                     n=sum;
                     m=n;
                     sum=0;
                 }
             }
             if(n==1){
                 return true;
             }
             return false;
         
     }
     public static void main(String[] args) {
         System.out.println(happyNum(145));
     }
 }
 
 
 