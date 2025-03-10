import java.util.*;

public class floyd_tri {
    public static void floyd_tri(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        floyd_tri();
    }
}

