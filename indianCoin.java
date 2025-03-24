import java.util.*;

public class indianCoin{
     public static int indianCoin(int coin[],int amt) {
          Arrays.sort(coin);

          int count=0;
          for(int i=coin.length-1;i>=0;i--){
               if(coin[i]<=amt){
                    while(coin[i]<=amt){
                         amt=amt-coin[i];
                         count++;
                    }
               }
          }
          return count;
     }
     public static void main(String[] args) {
          int coin[]={1,2,5,10,20,50,100,500,2000};
          System.out.println(indianCoin(coin, 590));
     }
}