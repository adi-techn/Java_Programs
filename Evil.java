import java.util.*;
public class Evil {
    public static long convertTobinary(int n){
        int binary=0,r,j=1;
        while(n!=0){
            r=n%2;
            binary+=r*j;
            j*=10;n=n/2;
        }
        return binary;
    }
    public static boolean checknum(int n){
        long binary=convertTobinary(n);
        int count=0;
        while(binary!=0){
            if(binary%10==1){
                count++;
            }
            binary=binary/10;
        }
        if(count%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number::");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        if(checknum(num)){
            System.out.println("Evil Number");
        }
        else{
            System.out.println("Not an Evil Number");
        }
    }
}
