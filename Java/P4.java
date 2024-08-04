public class P4 {
    
    static void factor(int n,int i)
    {
        if(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(i + " ");
            }
            factor(n, i+1);
        }
    }
    public static void main(String[] args)
    {
        int n=10;

        factor(n,1);
    }
}
