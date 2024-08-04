// WAP to find a sum of even number into 1D array. 
import java.util.*;
public class P1 {
     public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[4];
        int sum=0;
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println("The sum of the even number is " + sum);
     }
}
