
public class friend_pairing{
     public static int friendPair(int n){
         if(n==1||n==2){
             return n;
         }
         int fn=friendPair(n-1);
         int fn1=(n-1)*friendPair(n-2);
         int totalways=fn+fn1;
         return totalways;
     }
     public static void main(String[] args) {
         System.out.println(friendPair(3));
     }
 }
 
 
 