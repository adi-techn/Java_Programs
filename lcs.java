public class lcs {
     public static int lcs(String str1,String str2,int n,int m){
          if(n==0 || m==0){
               return 0;
          }
          if(str1.charAt(n-1)==str2.charAt(m-1)){
               return lcs(str1,str2,n-1,m-1)+1;
          }else{
               int ans1=lcs(str1,str2,n-1,m);
               int ans2=lcs(str1,str2,n,m-1);
               return Math.max(ans1, ans2);
          }
     }
     //Memoization
     public static int lcs2(String str1,String str2,int n,int m,int dp[][]){
          if(n==0 || m==0){
               return 0;
          }
          if(dp[n][m]!=-1){
               return dp[n][m];
          }
          if(str1.charAt(n-1)==str2.charAt(m-1)){
               dp[n][m]=lcs2(str1,str2,n-1,m-1,dp)+1;
               return dp[n][m];
          }else{
               int ans1=lcs2(str1, str2, n-1, m, dp);
               int ans2=lcs2(str1, str2, n, m-1, dp);
               dp[n][m]=Math.max(ans1, ans2);
               return dp[n][m];
          }
     }
     public static int lcs3(String str1,String str2,int n,int m){
          int dp[][]=new int[n+1][m+1];

          for(int i=0;i<n+1;i++){
               dp[i][0]=0;
          }
          for(int j=0;j<m+1;j++){
               dp[0][j]=0;
          }

          for(int i=1;i<n+1;i++){
               for(int j=1;j<m+1;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                         dp[i][j]=dp[i-1][j]+1;
                    }else{
                         int ans1=dp[i-1][j];
                         int ans2=dp[i][j-1];
                         dp[i][j]=Math.max(ans1, ans2);
                    }
               }
          }
          return dp[n][m];
     }

     public static void main(String[] args) {
          String str1="abcde";
          String str2="abc";
          int n=str1.length();
          int m=str2.length();

          /*
          int dp[][]=new int[n+1][m+1];
          for(int i=0;i<n+1;i++){
               for(int j=0;j<m+1;j++){
                    dp[i][j]=-1;
               }
          } 
          */
          System.out.println(lcs3(str1, str2, n, m));
     }
}
