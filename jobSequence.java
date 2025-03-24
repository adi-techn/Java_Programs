import java.util.*;

public class jobSequence{
     static class Job{
          int deadline;
          int profit;
          int id;

          public Job(int i,int d,int p){
               deadline=d;
               profit=p;
               id=i;
          }
     }
     public static int jobSeq(int job[][]){
          ArrayList<Job> jobs=new ArrayList<>();

          for(int i=0;i<job.length;i++){
               jobs.add(new Job(i,job[i][0],job[i][1]));
          }

          Collections.sort(jobs, (a,b)-> b.profit-a.profit);  //Descending order

          ArrayList<Integer> seq=new ArrayList<>();

          int time=0,max_profit=0;;
          for(int i=0;i<jobs.size();i++){
               Job curr=jobs.get(i);
               if(curr.deadline>time){
                    seq.add(curr.id);
                    max_profit+=curr.profit;
                    time++;
               }
          }

          System.out.println("Max size: "+time);
          System.out.println("Max Profit: "+max_profit);
          for(int j=0;j<seq.size();j++){
               System.out.print(seq.get(j)+" ");
          }

          return time;
     }
     public static void main(String[] args) {
          int job[][]={{4,20},{1,10},{1,40},{1,30}};
          jobSeq(job);
     }
}