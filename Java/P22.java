public class P22
{
    public static void main(String[] args) {
        int n=4;
        char currentcharacter='A';
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(count+ " ");
                    count++;
                }
                else
                {
                    System.out.print(currentcharacter+ " ");
                    currentcharacter++;
                }
            }
            System.out.println();
        }

    }
}