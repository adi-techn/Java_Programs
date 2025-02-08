import java.util.*;

public class binomialCoeff {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n,int r){
        int binCoe = (factorial(n)/(factorial(r)*factorial(n-r)));
        
        return binCoe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        System.out.println("Binomial Coefficient::"+binomialCoefficient(n, r));
    }
}

