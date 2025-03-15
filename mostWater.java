import java.util.ArrayList;

public class mostWater{
     //Brute Force Approach -- T.C.=O(n^2)
     public static int containWaterBrute(ArrayList<Integer> height){
          int max=0;
          for(int i=0;i<height.size();i++){
               for(int j=i+1;j<height.size();j++){
                    int h=Math.min(height.get(i), height.get(j));
                    int width=j-i;
                    int curr=h*width;
                    max=Math.max(max, curr);
               }
          }
          return max;
     }
     //Optimized Solution -- T.C.=O(n)
     public static int containWater(ArrayList<Integer> height){
          int max=0,fp=0,lp=height.size()-1;
          while(fp<lp){
               int h=Math.min(height.get(fp),height.get(lp));
               int width=lp-fp;
               int curr=h*width;
               max=Math.max(max, curr);
               if(height.get(fp)<height.get(lp))
                    fp++;
               else{
                    lp--;
               }
          }
          return max;
     }
     public static void main(String[] args) {
          ArrayList<Integer> height=new ArrayList<>();
          height.add(1);
          height.add(8);
          height.add(6);
          height.add(2);
          height.add(5);
          height.add(4);
          height.add(8);
          height.add(3);
          height.add(7);
          System.out.println(containWater(height));
     }
}
