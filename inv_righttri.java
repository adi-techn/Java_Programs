import java.util.*;
class inv_righttri{
    public static void main(String args[]){
        System.out.print("Enter value of rows::");
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}