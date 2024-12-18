public class UnionOfArray {
    public static void main(String[] args)
    {
        int[] num1={1,2,3,4,9};
        int[] num2={2,3,4,5};
        int max =Integer.MIN_VALUE;
        for(int i=0;i<num1.length;i++)
        {
            if(num1[i]>max)
            {
                max=num1[i];
            }
        }
        for(int i=0;i<num2.length;i++)
        {
            if(num2[i]>max)
            {
                max=num2[i];
            }
        }
        int[] frequency = new int[max+1];
        for(int i=0;i<num1.length;i++)
        {
            frequency[num1[i]]++;
        }
        for(int i=0;i<num2.length;i++)
        {
            frequency[num2[i]]++;
        }
        for(int i=0;i<frequency.length;i++)
        {
            if(frequency[i]!=0)
            {
                System.out.print(i+"");
            }
        }
    }
}
