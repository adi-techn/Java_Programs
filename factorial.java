// class factorial{
//     public static void main(String[] args) {
//         int n=5,fact=1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//         System.out.println("Factorial:: "+fact);
//     }
// }

class factorial{
    static int fact=1;
    static void fact(int n){
        if(n>0){
            fact*=n;
            fact(n-1);
        }
    }
    public static void main(String[] args) {
        fact(5);
        System.out.println("Factorial:: "+fact);
    }
}