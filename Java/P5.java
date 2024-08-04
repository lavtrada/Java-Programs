public class P5 {

    static int SumOfdigits(int num,int val){
        if(num<10){
            val+=num;
            return val;
        }

        return SumOfdigits(num/10,(num%10)+val);
    }
    public static void main(String[] args) 
    {
        int num=12345;
        int result=SumOfdigits(num,0);
        System.out.println(result);
    }
}

