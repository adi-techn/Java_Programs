public class recursion{
     public static void printInc(int n){
         if(n==1){
             System.out.print(n+" ");
             return;
         }
         printInc(n-1);
         System.out.print(n+" ");
         
     }
     public static void printDec(int n){
         if(n==1){
             System.out.print(n+" ");
             return;
         }
         System.out.print(n+" ");
         printDec(n-1);    
     }
     public static int fact(int n){
         if(n==0){
             return 1;
         }
         int fn=fact(n-1);
         int Fn=n*fact(n-1);
         return Fn;
     }
     public static int sum(int n){
         if(n==1){
             return 1;
         }
         int Sum=n+sum(n-1);
         return Sum;
     }
     public static int fib(int n){
         if(n==0 || n==1){
             return n;
         }
         int fn1=fib(n-1);
         int fn2=fib(n-2);
         int fn=fn1+fn2;
         return fn;
     }
     public static boolean isSorted(int[] arr,int i){
         if(i==arr.length-1){
             return true;
         }
         if(arr[i]>arr[i+1]){
             return false;
         }
         return isSorted(arr,i+1);
     }
     public static int firstOccur(int arr[],int key,int i){
         if(i==arr.length-1){
             return -1;
         }
         if(arr[i]==key){
             return i;
         }
         return firstOccur(arr, key, i+1);
     }
     public static int lastOccur(int arr[],int key,int i){
         if(i==arr.length){
             return -1;
         }
         int isFound=lastOccur(arr, key, i+1);
         if(isFound!=-1){
             return isFound;
         }
         if(arr[i]==key){
             return i;
         }
         return lastOccur(arr, key, i+1);
     }
     public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int p=x*power(x, n-1);
        return p;
     }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        System.out.println(lastOccur(arr, 2, 0));
     }
 }
 
 
 