import java.util.*;

public class matrixChainMultiplication {
     public static int mcm(int arr[],int i,int j){
          if(i==j){
               return 0;
          }
          int ans=Integer.MAX_VALUE;
          for(int k=i;k<=j-1;k++){
               int c1=mcm(arr, i, k);
               int c2=mcm(arr, k+1, j);
               int c3=arr[i-1]*arr[k]*arr[j];
               int finalCost=c1+c2+c3;
               ans=Math.min(ans, finalCost);
          }
          return ans;
     }
     public static int mcm_memo(int arr[],int i,int j,int dp[][]){
          if(i==j){
               return 0;
          }
          if(dp[i][j]!=-1){
               return dp[i][j];
          }
          int ans=Integer.MAX_VALUE;
          for(int k=i;k<=j-1;k++){
               int c1=mcm_memo(arr, i, k,dp);
               int c2=mcm_memo(arr, k+1, j, dp);
               int c3=arr[i-1]*arr[k]*arr[j];
               int fc=c1+c2+c3;
               ans=Math.min(ans, fc);
          }
          return dp[i][j]=ans;
     }
     public static int mcm_tab(int arr[]){
          int n=arr.length;
          int dp[][]=new int[n][n];

          //Initialization for (i==j)=0 (by-default)
          for(int i=0;i<n;i++){
               dp[i][i]=0;
          }

          for(int len=2;len<=n-1;len++){
               for(int i=1;i<=n-len;i++){
                    int j=i+len-1;
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=i;k<=j-1;k++){
                         int c1=dp[i][k];
                         int c2=dp[k+1][j];
                         int c3=arr[i-1]*arr[k]*arr[j];
                         int fc=c1+c2+c3;
                         dp[i][j]=Math.min(dp[i][j], fc);
                    }
               }
          }
          return dp[1][n-1];
     }
     public static void main(String[] args) {
          int arr[]={1,2,3,4,3};
          int n=arr.length;

          int dp[][]=new int[n][n];
          for(int k=0;k<n;k++){
               Arrays.fill(dp[k],-1);
          }

          System.out.println("Minimum Cost: "+mcm_tab(arr));
     }
}
