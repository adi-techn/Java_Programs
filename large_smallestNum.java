import java.util.*;

public class large_smallestNum{
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int marks[]={10,20,30,40,50};
        System.out.println("Largest number:: "+getLargest(marks));
        System.out.println("Smallest number:: "+getSmallest(marks));
    }
}

