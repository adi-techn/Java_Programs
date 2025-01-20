import java.util.*;

public class binarySearch {
    //prerequisite - sorted array
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=(arr.length-1);
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int marks[]={10,20,30,40,50};
        int k=40;
        int index=binarySearch(marks, k);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at::"+index);
        }
    }
}
