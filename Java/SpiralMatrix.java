import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print(sc.nextInt());
            }
            System.out.println();
        }
        
    }
}
