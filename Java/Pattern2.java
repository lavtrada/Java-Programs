public class Pattern2 {
    public static void main(String[] args)
    {
        int n=5 ;
        int temp=n*2-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=temp;j++)
            {
                System.out.print("*");
            }
            temp=temp-2;
            System.out.println();
        }
    }
}
