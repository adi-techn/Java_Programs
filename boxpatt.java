import java.util.*;
class boxpatt{
    public static void main(String args[]){
        System.out.print("Enter value of rows & Column::");
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){  
            for(int j=1;j<=c;j++){
                if(i==1||j==1||i==r||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}