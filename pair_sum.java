import java.util.ArrayList;

public class pair_sum{
     //Brute Force Approach -- T.C.=O(n^2)
     public static ArrayList<Integer> pairSum(ArrayList<Integer> list,int t){
          ArrayList<Integer> l1=new ArrayList<>();
          for(int i=0;i<list.size()-1;i++){
               for(int j=i+1;j<list.size();j++){
                    if(list.get(i)+list.get(j)==t){
                         l1.add(list.get(i));
                         l1.add(list.get(j));
                         return l1;
                    }
               }
          }
          return l1;
     }
     //Optimized Solution -- T.C.=O(n)
     public static ArrayList<Integer> pairSum1(ArrayList<Integer> list,int t){
          ArrayList<Integer> l1=new ArrayList<>();
          int fp=0,lp=list.size()-1;
          while(fp!=lp){
               if(list.get(fp)+list.get(lp)==t){
                    l1.add(list.get(fp));
                    l1.add(list.get(lp));
                    return l1;
               }
               else if(list.get(fp)+list.get(lp)>t){
                    lp--;
               }
               else{
                    fp++;
               }
          }
          return l1;
     }
     //Optimized Solution -- T.C.=O(n)
     public static ArrayList<Integer> pairSum2(ArrayList<Integer> list,int t){
          ArrayList<Integer> l1=new ArrayList<>();
          int fp=0,lp=0,n=list.size(),pivot=-1;
          for(int i=0;i<list.size();i++){
               if(list.get(i)>list.get(i+1)){
                    pivot=i+1;
                    break;
               }
          }
          fp=pivot;
          lp=pivot-1;
          while(fp!=lp){
               if(list.get(fp)+list.get(lp)==t){
                    l1.add(list.get(fp));
                    l1.add(list.get(lp));
                    return l1;
               }
               else if(list.get(fp)+list.get(lp)>t){
                    lp=(lp+1)%n;
               }
               else{
                    fp=(n+fp-1)%n;
               }
          }
          return l1;
     }
     public static void main(String[] args) {
          ArrayList<Integer> height=new ArrayList<>();
          height.add(1);
          height.add(2);
          height.add(3);
          height.add(4);
          height.add(5);
          height.add(6);
          System.out.println(pairSum1(height,11));
     }
}
