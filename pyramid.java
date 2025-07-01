import java.util.*;
class pyramid{
    public static void main(String args[]){
        System.out.print("Enter no. of rows::");
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=i;j<r;j++)
                System.out.print(" ");
            for(int j=1;j<=(2*i-1);j++)
                System.out.print("*");
            System.out.println();
        }
    }
}