public class Patter1 {
    public static void main(String[] args)
    {
        int num=4;
        int count=1;
        char currentCharacter='A';
        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(count+" ");
                    count++;
                }
                else
                {
                    System.out.print(currentCharacter+" ");
                    currentCharacter++;
                }
            }
            System.out.println();
        }

    }
}
