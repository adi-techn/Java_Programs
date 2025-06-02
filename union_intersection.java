import java.util.HashSet;

public class union_intersection {
     public static void main(String[] args) {
          int arr1[]={1,2,3};
          int arr2[]={3,4,5,6};

          HashSet<Integer> hs=new HashSet<>();

          //Union
          for(int x:arr1){
               hs.add(x);
          }
          for (int x : arr2) {
               hs.add(x);
          }
          System.out.println("Union : "+hs.size());

          //Intersection
          hs.clear();
          for (int x : arr1) {
               hs.add(x);
          }
          int c=0;
          for(int x:arr2){
               if(hs.contains(x)){
                    c++;
                    hs.remove(x);
               }
          }
          System.out.println("Intersection : "+c);
     }
}
