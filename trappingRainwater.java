public class trappingRainwater{
    public static int trappingRainwater(int arr[]){
        int n=arr.length;

        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }

        int wl[]=new int[n];
        int trapwater=0,width=1;
        for(int i=0;i<n;i++){
            wl[i]=Math.min(leftmax[i],rightmax[i]);
            trapwater+=(wl[i]-arr[i])*width;
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappingRainwater(height));
    }
}

