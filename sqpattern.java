import java.util.*;
class sqpattern{
    public static void main(String args[]){
        System.out.print("Enter value of rows & Column::");
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}