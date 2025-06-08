public class NumPointsWithCost{
     public static int NumPointsWithCost(int arr[][]){
         int a[]=new int[arr.length];
         int c=0,p=0,abs=0;
         for(int i=0;i<arr.length;i++){
             int p1=0;
             for(int j=0;j<arr[i].length;j++){
                 if(p1<=arr[i][j]){
                     p1=arr[i][j];
                     c=j;
                 }
             }
             p+=p1;
             a[i]=c;
         }
         for(int i=0;i<a.length-1;i++){
             abs+=(a[i]-a[i+1]);
         }
         p-=abs;
         return p;
     }
     public static void main(String[] args) {
         int arr[][]={{1,5},{2,3},{4,2}};
         System.out.println(NumPointsWithCost(arr));
     }
 }