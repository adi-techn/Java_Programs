public class bitOperation{
    public static void getIth(int n,int i){
        int b= n & (1<<i);
        if(b==0){
            System.out.println("0 at "+i+"th bit");
        }
        else{
            System.out.println("1 at "+i+"th bit");
        }
    }
    public static void setIth(int n,int i){
        int b= n | (1<<i);
        System.out.println("Result::"+b);
    }
    public static void clearIth(int n,int i){
        int b= n & (~(1<<i));
        System.out.println("Result::"+b);
    }
    public static int clearLastIth(int n,int i){
        int b=n&(~0<<i);
        return b;
    }
    public static int clearRange(int n,int i,int j){
        int a=(~0<<(j+1));
        int b=(int)Math.pow(2, i)-1;
        return n&(a|b);
    }
    public static boolean isPower2(int n){
        if((n & n-1)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Result::"+clearRange(n,2,4));
    }
}
