public class strConversion {
     public static int LCS(String str1,String str2,int n,int m){
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
                         dp[i][j]=dp[i-1][j-1]+1;
                    }else{
                         int ans1=dp[i-1][j];
                         int ans2=dp[i][j-1];
                         dp[i][j]=Math.max(ans1,ans2);
                    }
               }
          }
          return dp[n][m];
     }
     public static void main(String[] args) {
          String str1="abcdef";
          String str2="aceg";
          int n=str1.length();
          int m=str2.length();

          int lcs=LCS(str1, str2, n, m);

          int del=Math.abs(n-lcs);
          int add=Math.abs(m-lcs);

          System.out.println("LCS: "+lcs);
          System.out.println("Delete Operations: "+del);
          System.out.println("Add Operations: "+add);
     }
}
