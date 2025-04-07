public class shift_letter{
     public static String shiftingLetters(String s,int shift[]){
          char ps[]=new char[s.length()];
          for(int i=0;i<s.length();i++){
               ps[i]=s.charAt(i);
          }
          int totalShift=0;
          for(int i=s.length()-1;i>=0;i--){
               totalShift=(totalShift+shift[i])%26;
               ps[i]=shift(ps[i],totalShift);
          }
          String str="";
          for(int i=0;i<ps.length;i++){
               str+=ps[i];
          }
          return str;
     }
     public static char shift(char c,int f){
          return (char) ('a' + (c - 'a' + f) % 26);
     }
     public static void main(String[] args) {
          int arr[]={3,5,9};
          System.out.println(shiftingLetters("abc",arr));
     }
}