import java.util.*;

class Solution{
    static int maxScore=0;
    public static void backtrack(int idx,int M,int N,int people[][],int supply[],int currSatis){
        if(idx==M){
            maxScore=Math.max(maxScore,currSatis);
            return;
        }
        
        boolean canTake=true;
        for(int j=0;j<N;j++){
            if(supply[j]<people[idx][j+1]){
                canTake=false;
                break;
            }
        }
        if(canTake){
            for(int j=0;j<N;j++){
                supply[j]-=people[idx][j+1];
            }
            backtrack(idx+1,M,N,people,supply,currSatis+people[idx][0]);
            for(int j=0;j<N;j++){
                supply[j]+=people[idx][j+1];
            }
        }
        backtrack(idx+1,M,N,people,supply,currSatis);
    }
}
public class fruitDistribute{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        
        int supply[]=new int[N];
        for(int i=0;i<N;i++){
            supply[i]=sc.nextInt();
        }
        
        int people[][]=new int[M][N+1];
        for(int i=0;i<M;i++){
            people[i][0]=sc.nextInt();
            for(int j=1;j<=N;j++){
                people[i][j]=sc.nextInt();
            }
        }
        
        Solution s=new Solution();
        
        s.backtrack(0,M,N,people,supply,0);
        System.out.print("Max satisfaction score::"s.maxScore);
    }
}