import java.util.*;

public class activitySelection {
     public static void main(String[] args) {
          int st[]={1,5,0,5,8,3};
          int end[]={2,9,6,7,9,4};  
          
          //Sorting end time
          int activities[][]=new int[st.length][3];
          for(int i=0;i<st.length;i++){
               activities[i][0]=i;
               activities[i][1]=st[i];
               activities[i][2]=end[i];
          }

          //Lamda Function
          Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

          int maxAct=0;
          ArrayList<Integer> idx=new ArrayList<>();

          //selected 1st activity
          maxAct=1;
          idx.add(activities[0][0]);
          int lastEnd=activities[0][2];  
          
          for(int i=1;i<st.length;i++){
               if(activities[i][1]>=lastEnd){  //Condition to select next activity
                    maxAct++;
                    idx.add(activities[i][0]);
                    lastEnd=activities[i][2];
               }
          }
          System.out.println("Max Activity:: "+maxAct);  //Max activity

          //Activity names
          for(int i=0;i<idx.size();i++){
               System.out.print("A"+idx.get(i)+" ");
          }
     }
}
