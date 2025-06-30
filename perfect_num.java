public class perfect_num{
    public static boolean perfect(int num){
        int fsum=0;
        for(int i=1;i<num;i++){
            if((num%i)==0){
                fsum+=i;
            }
        }
        if (num==fsum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(perfect(7));
    }
}