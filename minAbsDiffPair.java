import java.util.Arrays;

public class minAbsDiffPair {
     public static int minAbsDiff(int A[],int B[]){
          Arrays.sort(A);
          Arrays.sort(B);

          int minDiff=0;
          for(int i=0;i<A.length;i++){
               minDiff+=Math.abs(A[i]-B[i]);
          }
          return minDiff;
     }
     public static void main(String[] args) {
          int arr1[]={1,2,3};
          int arr2[]={2,1,3};

          System.out.println(minAbsDiff(arr1, arr2));
     }
}
