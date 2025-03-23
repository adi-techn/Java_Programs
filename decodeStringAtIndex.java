import java.util.Stack;

public class decodeStringAtIndex{
    public static String decodeAtIndex(String str, int k) {
        Stack<Character> s=new Stack<>();
        int i=0;
        String str1="";
        while (i<str.length()) {
            char ch=str.charAt(i);
            if(ch>='2'&&ch<='9'){
                int d=(ch-'0')-1;
                for(int m=0;m<d;m++){
                    int j=0;
                    while(j<str1.length()){
                        s.push(str1.charAt(j));
                        j++;
                    }
                    str1+=str1;
                }
            }
            else{
                s.push(ch);
                str1+=ch;
            }
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse().toString();
        return String.valueOf(sb.charAt(k-1));
    }
    public static void main(String[] args) {
        System.out.println(decodeAtIndex("ha22", 5));
    }
}
