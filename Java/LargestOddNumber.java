public class LargestOddNumber {
    public static void main(String[] args)
    {
        int num=56227;
        while(num>0)
        {
            if(num%2!=0)
            {
                System.out.print("The largest number which is odd is"+ num);
                break;
            }
            else
            {
                num=num/10;
            }
        }
    }
}
