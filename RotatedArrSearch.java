public class RotatedArrSearch{
     public static int search(int arr[],int tar,int si,int ei){
         if(si>ei){
             return -1;
         }
         int mid=(si+ei)/2;
         if(arr[mid]==tar){
             return mid;
         }
         // mid on l1
         if(arr[si]<=arr[mid]){      //target at L1 left   
             if(arr[si]<=tar && tar<=arr[mid]){
                 return search(arr, tar, si, mid-1);
             }
             else{                  //target at L1 right
                 return search(arr, tar, mid+1, ei);
             }
         }
         //mid on l2
         else{                     
             if(arr[mid]<=tar && tar<=arr[ei]){        //target at L2 right
                 return search(arr, tar, mid+1, ei);
             }
             else{                                    //target at l2 left
                 return search(arr, tar, si, mid-1);
             }
         }
     }
     public static void printArr(int arr[]){
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
     }
     public static void main(String[] args) {
         int arr[]={4,5,6,7,0,1,2};
         System.out.println(search(arr, 0, 0, arr.length-1));  
     }
 }