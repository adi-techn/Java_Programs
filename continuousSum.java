import java.util.ArrayList;
public class continuousSum{
    public static boolean continuousSubarraySum(int arr[],int k){
        int ts=0;
        ArrayList<Integer> ps=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ts+=arr[i];
            ps.add(arr[i]);
        }
        for(int i=arr.length-1;i>0;i--){
            if(ts%k==0 && ps.size()>=2){
                return true;
            }
            ts-=arr[i];
            ps.remove(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,0,0,0};
        System.out.println(continuousSubarraySum(arr,3));
    }
}
