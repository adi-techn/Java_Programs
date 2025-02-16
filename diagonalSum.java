import java.util.*;

public class diagonalSum{
    public static int diagonalSum(int arr[][]){         //Brute Force Sol--T.C.=O(n^2)
        int sum=0;
        if(arr.length!=arr[0].length){
            return 0;
        }
        if(arr.length==1){
            return arr[0][0];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        if(arr.length%2!=0){
            sum-=arr[arr.length-2][arr[0].length-2];
        }
        return sum;
    }
    public static int diagonalSum_opt(int arr[][]){        //Optimized solution--T.C.=O(n)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{7,9,8,6,3},{3,9,4,5,2},{8,1,10,4,10},{9,5,10,9,6},{7,2,4,10,8}};
        printArr(arr);
        System.out.println("Sum of the diagonal elements(primary & secondary)::"+diagonalSum(arr));
    }
}

