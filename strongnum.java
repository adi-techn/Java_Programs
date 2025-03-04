import java.util.*;
public class strongnum{
    public static void main(String[] args) {
        int num=145,sum=0;
        int m=num,r,fact=1;
        for(int i=0;i<String.valueOf(m).length();i++){
            r=num%10;
            num=num/10;
            for(int j=r;j>0;j--){
                fact*=j;
            }
            sum+=fact;
            fact=1;
        }
        if(m==sum){
            System.out.println("Krishnamurthy Number");
        }
        else{
            System.out.println("Not a Krishnamurthy Number");
        }
    }
}