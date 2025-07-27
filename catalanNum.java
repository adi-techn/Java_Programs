public class catalanNum {
     public static int catalan1(int n){  //Recursion
          if(n==0 || n==1){
               return 1;
          }

          int ans=0;
          for(int i=0;i<n;i++){
               ans+=catalan1(i)*catalan1(n-i-1);
          }
          return ans;
     }
     public static int catalan2(int n,int dp[]){
          if(n==0||n==1){
               return 1;
          }
          if(dp[n]!=-1){
               return dp[n];
          }
          int ans=0;
          for(int i=0;i<n;i++){
               ans+=catalan2(i, dp)*catalan2(n-i-1, dp);
          }
          return dp[n]=ans;
     }
     public static int catalan3(int n){
          int dp[]=new int[n+1];

          dp[0]=1;
          dp[1]=1;

          for(int i=2;i<n+1;i++){
               for(int j=0;j<=(i-1);j++){
                    dp[i]+=dp[j]*dp[i-j-1];
               }
          }
          return dp[n];
     }
     public static void main(String[] args) {
          int n=4;
          /*
          int dp[]=new int[n+1];
          for(int i=0;i<n+1;i++){
               dp[i]=-1;
          }
          */

          System.out.println(catalan3(n));
     }
}
