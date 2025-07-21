public class rodCutting {
     public static int maxProfitRod(int price[],int len[],int rodLen){
          int n=len.length;
          int dp[][]=new int[n+1][rodLen+1];

          for(int i=1;i<n+1;i++){
               for(int j=1;j<rodLen+1;j++){
                    if(len[i-1]<=j){
                         int incProf=price[i-1]+dp[i][j-len[i-1]];
                         int excProf=dp[i-1][j];
                         dp[i][j]=Math.max(incProf, excProf);
                    }else{
                         dp[i][j]=dp[i-1][j];
                    }
               }
          }
          return dp[n][rodLen];
     }
     public static void main(String[] args) {
          int len[]={1,2,3,4,5,6,7,8};
          int price[]={1,5,8,9,10,17,17,20};
          int totRod=8;

          System.out.println(maxProfitRod(price, len, totRod));
     }
}
