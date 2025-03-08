import java.util.*;
public class MonotonicArray{
    public static boolean isMonotonic(ArrayList<Integer> arr){
        boolean inc=true,dec=true;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1))
                inc=false;
            if(arr.get(i+1)>arr.get(i))
                dec=false;
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(isMonotonic(arr));
    }
}
