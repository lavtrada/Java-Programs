// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
import java.util.Scanner;

public class P169 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
           for(int j=1;j<arr.length;j++)
           {
            if(arr[i]==arr[j])
            {
                count++;
            }
           }
           if(count>arr.length/2)
           {
            System.out.print(arr[i]+ " ");
           } 
        }

    }
}
