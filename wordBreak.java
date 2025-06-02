public class wordBreak {
     static class Node{
          Node child[]=new Node[26];
          boolean eow=false;

          Node(){
               for(int i=0;i<child.length;i++){
                    child[i]=null;
               }
          }
     }
     public static Node root=new Node();
     public static void insert(String word){
          Node curr=root;
          for(int i=0;i<word.length();i++){
               int idx=word.charAt(i)-'a';
               if(curr.child[idx]==null){
                    curr.child[idx]=new Node();
               }
               curr=curr.child[idx];
          }
          curr.eow=true;
     }
     public static boolean search(String key){
          Node curr=root;
          for(int i=0;i<key.length();i++){
               int idx=key.charAt(i)-'a';
               if (curr.child[idx]==null) {
                    return false;
               }
               curr=curr.child[idx];
          }
          return curr.eow==true;
     }
     public static boolean wordBreak(String key){
          if(key.length()==0){
               return true;
          }
          for(int i=1;i<=key.length();i++){
               if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                    return true;
               }
          }
          return false;
     }
     public static void main(String[] args) {
          String word[]={"i","like","sam","samsung","ice"};
          for(int i=0;i<word.length;i++){
               insert(word[i]);
          }
          String key="ilikesung";
          System.out.println(wordBreak(key));
     }
}
