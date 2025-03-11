public class gridways{
     public static int grid(int i,int j,int n,int m){     //Using recursion and backtracking
          //Base Case
          if(i==n-1 || j==m-1){      //Last cell 
               return 1;
          }
          else if(i==n || j==m){     //Boundary cross condition
               return 0;
          }
          //Recursion
          int w1=grid(i+1, j, n, m);
          int w2=grid(i, j+1, n, m);
          return w1+w2;
     }
     public static int fact(int n){
          if(n==1 || n==0){
               return 1;
          }
          return n*fact(n-1);
     }
     public static void main(String[] args) {
          int n=3,m=3;
          int total_ways=(fact(n-1+m-1)/(fact(n-1)*fact(m-1)));
          System.out.println(total_ways);
     }
}