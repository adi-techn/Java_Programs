import java.util.*;

public class Bipartite {
     static class Edge{
          int src;
          int dest;

          public Edge(int src,int dest){
               this.src=src;
               this.dest=dest;
          }
     }
     public static void create(ArrayList<Edge> graph[],int v){
          for(int i=0;i<v;i++){
               graph[i]=new ArrayList<>();
          }

          //vertex 0
          graph[0].add(new Edge(0, 1));
          graph[0].add(new Edge(0, 2));

          //vertex 1
          graph[1].add(new Edge(1, 0));
          graph[1].add(new Edge(1, 3));

          //vertex 2
          graph[2].add(new Edge(2, 0));
          graph[2].add(new Edge(2, 4));

          //vertex 3
          graph[3].add(new Edge(3, 4));
          graph[3].add(new Edge(3, 1));

          //vertex 4
          graph[4].add(new Edge(4, 3));
          graph[4].add(new Edge(4, 2));

     }
     public static boolean isBipartite(ArrayList<Edge> graph[]){
          int color[]=new int[graph.length];
          for(int i=0;i<color.length;i++){
               color[i]=-1;  //no color
          }

          Queue<Integer> q=new LinkedList<>();

          for(int i=0;i<graph.length;i++){
               if(color[i]==-1){   //BFS
                    q.add(i);
                    color[i]=0;      //Yellow
                    while (!q.isEmpty()) {
                         int curr=q.remove();
                         for(int j=0;j<graph[curr].size();j++){
                              Edge e=graph[curr].get(j);     //to get neigh = e.dest
                              if(color[e.dest]==-1){
                                   int nextCol= color[curr] == 0 ? 1:0;
                                   color[e.dest]=nextCol;
                                   q.add(e.dest);
                              }else if(color[e.dest]==color[curr]){
                                   return false;
                              }
                         }
                    }
               }
          }
          return true;
     }
     public static void main(String[] args) {
          int v=5;
          @SuppressWarnings("unchecked")
          ArrayList<Edge> graph[]=new ArrayList[v];
          create(graph, v);
          System.out.println(isBipartite(graph));
     }
}
