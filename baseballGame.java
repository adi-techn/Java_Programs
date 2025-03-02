import java.util.Stack;

public class baseballGame{
     public static int calPoints(String[] op) {
        Stack<Integer> s=new Stack<>();
        s.push(Integer.valueOf(op[0]));
        int i=1;
        while(i<op.length){
          String str=op[i];
          if(s.size()>=2 && str=="+"){
               int x=s.peek();
               s.pop();
               int y=s.peek();
               s.push(x);
               s.push(x+y);
          }
          else if(!s.isEmpty() && str=="D"){
               int x=s.peek();
               s.push(x*2);
          }
          else if(!s.isEmpty() && str=="C"){
               s.pop();
          }
          else{
               s.push(Integer.valueOf(str));
          }
          i++;
        }
        int sum=0;
        while(!s.isEmpty()){
          sum+=s.pop();
        }
        return sum;
     }
     public static void main(String[] args) {
          String s[]={"5","2","C","D","+"};
          System.out.println(calPoints(s));
     }
}
