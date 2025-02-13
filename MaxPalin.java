public class MaxPalin{
     public static int max_palin(String nums){
          int freq[]=new int[10];
          int c=0,sum=0;
          for(int i=0;i<nums.length();i++){
               freq[nums.charAt(i)-'0']+=1;
          }
          for(int i=0;i<freq.length;i++){
               if(freq[i]%2!=0){
                    freq[i]-=1;
                    c++;
               }
               sum+=freq[i];
          }
          if(c>0)
               sum+=1;
          return sum;
     }
     public static void main(String[] args) {
          System.out.println(max_palin("9431149152"));
     }
}

