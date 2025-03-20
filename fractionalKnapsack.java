import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
     public static int fractKnapsack(int value[],int weight[],int W){
          int n=weight.length;
          double ratio[][]=new double[n][2];
          int maxVal=0;

          //Ratio of value/weight
          for(int i=0;i<n;i++){
               ratio[i][0]=i;
               ratio[i][1]=value[i]/(double)weight[i];
          }

          //Lamda Function
          Arrays.sort(ratio ,Comparator.comparingDouble(o -> o[1]));

          // for(int i=0;i<n;i++){
          //      for(int j=0;j<2;j++){
          //           System.out.print(ratio[i][j]+" ");
          //      }
          //      System.out.println();
          // }

          for(int i=ratio.length-1;i>=0;i--){
               int idx=(int)ratio[i][0];
               if(W>=weight[idx]){
                    W-=weight[idx];
                    maxVal+=value[idx];
               }
               else{
                    maxVal+=(ratio[i][1]*W);
                    W=0;
                    break;
               }
          }
          return maxVal;
     }
     public static void main(String[] args) {
          int value[]={60,100,120};
          int weight[]={10,20,30};
          int val=fractKnapsack(value,weight, 50);
          System.out.println(val);
     }
}
