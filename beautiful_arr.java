import java.util.*;
public class beautiful_arr{
    public boolean isBeautiful(int[] arr) {
        // int arr[]=new int[] {1,3,4,5,2};
        int auxarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1 && arr[i]<=arr.length){
                auxarr[i]=arr[i];
            }
            else{
                return false;
            }
        }
        Arrays.sort(auxarr);
        for(int i=0;i<auxarr.length;i++){
            if(auxarr[i]==arr[i]){
                if(i==arr.length-1){
                    return false;
                }
            }
            if(i!=0 && auxarr[i]==auxarr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,3,4,6,5};
        beautiful_arr obj=new beautiful_arr();
        if(obj.isBeautiful(arr)){
            System.out.println("Beautiful Array");
        }
        else{
            System.out.println("Not Beautiful Array");
        }
    }
}