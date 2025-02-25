import java.util.*;

public class binaryToDecimal {

    public static int binaryToDecimal(int n){
        int p=0,dec=0,lastdig;
        while(n!=0){
            lastdig=n%10;
            dec=dec+(lastdig*((int)Math.pow(2,p)));
            n=n/10;
            p++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Decimal no.::"+binaryToDecimal(n));
    }
}

