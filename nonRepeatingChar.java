import java.util.*;
public class nonRepeatingChar {
     public static char nonrepeatingChar(String str){
          Queue<Character> q=new LinkedList<>();
          int freq[]=new int[26];
          for(int i=0;i<str.length();i++){
               char ch=str.charAt(i);
               q.add(ch);
               freq[ch-'a']++;
          }
          while(!q.isEmpty()){
               char ch=q.remove();
               if(freq[ch-'a']==1){
                    return ch;
               }
          }
          return '#';
     }
     public static void main(String[] args) {
          System.out.println(nonrepeatingChar("aabccxb"));
     }
}
