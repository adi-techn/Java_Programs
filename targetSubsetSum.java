public class targetSubsetSum {
     public static boolean targetSum(int nums[],int k){
          int n=nums.length;
          boolean dp[][]=new boolean[n+1][k+1];

          //index meaning : i=items & j=target sum
          //sum=0, whatever be the no. of items => true
          for(int i=0;i<dp.length;i++){
               dp[i][0]=true;
          }
          //item=0, whatever be the sum value => false(by default false initialized)

          for(int i=1;i<dp.length;i++){
               for(int j=1;j<k+1;j++){
                    int val=nums[i-1];
                    if(val<=j && dp[i-1][j-val]==true){  //include
                         dp[i][j]=true;
                    }
                    else if(dp[i-1][j]=true){   //exclude
                         dp[i][j]=true;
                    }
               }
          }
          return dp[n][k];
     }
     public static void main(String[] args) {
          int nums[]={4,2,7,1,3};
          int t=10;

          System.out.println(targetSum(nums, t));
     }
}
