public class inversionCount{
     //Brute Force Algo.
     public static int InversionCount(int arr[],int n) {      
         int c=0;
         for(int i=0;i<arr.length-1;i++){
             for(int j=1;j<arr.length;j++){
                 if(i<j && arr[i]>arr[j]){
                     c++;
                 }
             }
         }
         if(c!=0){
             return c;
         }
         return 0;
     }
 
     //Merge Sort Algo.
     public static int InversionCountMergeSort(int arr[],int si,int ei){
         int c=0;
         if(si<ei){
             int mid=(si+ei)/2;
             
             c=InversionCountMergeSort(arr,si,mid);
             c+=InversionCountMergeSort(arr, mid+1, ei);
             c+=merge(arr,si,mid+1,ei);
         }
         return c;   
     }
     public static int merge(int arr[],int si,int mid,int ei){
         int temp[]=new int[ei-si+1];
         int i=si;
         int j=mid;
         int k=0;
         int count=0;
 
         while(i<mid && j<=ei){
             if(arr[i]<=arr[j]){
                 temp[k]=arr[i++];
             }   
             else{
                 temp[k]=arr[j++];
                 count+=(mid-i);
             }
             k++;
         }
         while(i<mid){
             temp[k++]=arr[i++];
         }
         while(j<=ei){
             temp[k++]=arr[j++];
         }
         for(int l=si,m=0;l<=temp.length;m++,l++){
             arr[m]=temp[l];
         }
         return count;
     }
     public static void main(String[] args) {
         int arr[]={1,8,6,4,5};
         System.out.println(InversionCount(arr,arr.length));
     }
 }