import java.util.ArrayList;

public class longestSubstring{
     public static int lenOfLongestSubstring(String s) {
          ArrayList<String> sub=new ArrayList<>();

          for(int i=0;i<s.length();i++){
               for(int j=i;j<=s.length();j++){
                    sub.add(s.substring(i,j));
               }
          }
          int maxlen=0;
          for(int i=0;i<sub.size();i++){
               int len=0;
               int freq[]=new int[26];
               for(int j=0;j<sub.get(i).length();j++){
                    char ch=sub.get(i).charAt(j);
                    freq[ch-'a']+=1;
                    if(freq[ch-'a']>1){
                         break;
                    }
                    len++;
               }
               maxlen=Math.max(maxlen, len);
          }

          return maxlen;
     }
     public static void main(String[] args) {
          System.out.println(lenOfLongestSubstring("abcabcabb"));
     }
}
