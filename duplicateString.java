
public class duplicateString{
     public static void duplicateString(String str,int idx,StringBuilder sb, boolean[] map){
         if(idx==str.length()){
             System.out.println(sb);
             return;
         }
         char curr=str.charAt(idx);
         if(map[curr-'a']==true){
             duplicateString( str, idx+1, sb,  map);
         }
         else{
             map[curr-'a']=true;
             duplicateString( str, idx+1, sb.append(curr),  map);
         }
     }
     public static void main(String[] args) {
         String str="adixttya";
         duplicateString(str,0,new StringBuilder(""),new boolean[26] );
     }
 }
 
 
 