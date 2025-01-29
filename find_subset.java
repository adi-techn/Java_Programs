
public class find_subset{
     public static void findSubsets(String str,String ans,int i) {     
        if(i==str.length()){
          System.out.println(ans);
          return;
        }
        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
     }
     public static void printArr(int arr[]){
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
          }
          System.out.println();
     }
     public static void main(String[] args) {
          findSubsets("abc", "", 0);
     }
}
