// Java Program to print pattern
// Reverse Left Half Pyramid 

public class GeeksForGeeks {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        // calculating number of spaces
        for(int i=1;i<=n;i++)
        {
        	for(int k=1;k<i;k++)
            {
              System.out.print(" ");
            }
        for(int j=n;j>=i;j--)
        {
          System.out.print("*");
        }
          System.out.println("");
          
    }
    }
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
