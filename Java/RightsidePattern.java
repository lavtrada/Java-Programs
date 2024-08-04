public class RightsidePattern {
    public static void main(String[] args)
    {
        int num = 6;
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < i; j++) // Fixed: Changed from 1 to 0
            {
                System.out.print(" ");
            }
            for (int j = 0; j < num - i; j++) // Fixed: Changed from 1 to 0
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
