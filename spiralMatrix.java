import java.util.*;

public class spiralMatrix {
    public static void spiralMatrix(int arr[][]){
        int strow=0;
        int stcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;

        while(strow<=endrow && stcol<=endcol){
            //top boundary
            for(int j=stcol;j<=endcol;j++){
                System.out.print(arr[strow][j]+" ");
            }
            //right
            for(int i=strow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=stcol;j--){
                if(strow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=strow+1;i--){
                if(stcol==endcol){
                    break;
                }
                System.out.print(arr[i][stcol]+" ");
            }
            strow++;stcol++;endcol--;endrow--;
        }
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
        int arr[][]={{10,30,20},{40,80,50},{60,70,90}};
        printArr(arr);
        spiralMatrix(arr);
    }
}
