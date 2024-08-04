// public class InversePattern {
//     public static void main(String[] args) {
//         int n=5;
//         int temp=n*2-1;
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;i>j;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<temp;j++)
//             {
//                 System.out.print("*");
//             }
//             temp=temp-2;
//             System.out.println();
//         }
        
//     }
// }
public class InversePattern {
    public static void main(String[] args) {
        int n = 5;
        int temp = n * 2 - 1; // Initialize temp to the number of stars in the first row
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" "); // Print spaces at the beginning of each row
            }
            for (int j = 1; j <= temp; j++) {
                System.out.print("*"); // Print stars
            }
            temp -= 2; // Decrease the number of stars for the next row
            System.out.println(); // Move to the next line
        }
    }
}
