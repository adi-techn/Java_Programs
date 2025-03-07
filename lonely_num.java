import java.util.*;

public class lonely_num{
public static ArrayList<Integer> findLonely(int[] arr) {
     Arrays.sort(arr);
     ArrayList<Integer> list=new ArrayList<>();
     if(arr.length==1)
         list.add(arr[0]);
     if((arr[0]+1!=arr[1])&&(arr[0]!=arr[1]))
         list.add(arr[0]);
     if((arr[arr.length-1]!=arr[arr.length-2]+1)&&(arr[arr.length-1]!=arr[arr.length-2]))
         list.add(arr[arr.length-1]);
     for(int i=1;i<arr.length-1;i++){
         if((arr[i-1]!=arr[i]-1 && arr[i+1]+1!=arr[i])&&(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]))
             list.add(arr[i]);
     }
     return list;
 }
 public static void main(String[] args) {
     int arr[]={62,35,59,55,84,61,38,87,55,82};
     System.out.println(findLonely(arr));
 }
}