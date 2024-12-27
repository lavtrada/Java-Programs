
import java.util.*;
    public class  Fibonacci{
    public static int fib(int num){
        if(num==0)
        {
            return 0;            
        }
        return num+fib(num-1);
    }
    {

    }
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=fib(num);
        System.out.println(result);
    }
}
