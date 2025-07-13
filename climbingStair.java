import java.util.*;
public class climbingStair {
     public static int ways(int n){
          if(n==0){
               return 1;
          }
          if(n<0){
               return 0;
          }
          return ways(n-1)+ ways(n-2);
     }
     public static int countWays(int n,int way[]){
          if(n==0){
               return 1;
          }
          if(n<0){
               return 0;
          }

          if(way[n]!=-1){
               return way[n];
          }

          way[n]=countWays(n-1, way)+countWays(n-2, way);
          return way[n];
     }
     public static void main(String[] args) {
          int n=4;
          int way[]=new int[n+1];
          Arrays.fill(way,-1);
          System.out.println(countWays(n,way));
     }
}
