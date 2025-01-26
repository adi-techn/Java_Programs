import java.util.*;
public class spy_num{
    public static void main(String[] args) {
        int num,sum=0,prod=1,l,r;
        System.out.println("Enter the number::");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        l=String.valueOf(num).length();
        for(int i=0;i<l;i++){
            r=num%10;
            sum+=r;
            prod*=r;
            num=num/10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }
        else{
            System.err.println("Not a spy number");
        }
    }
}
