// WAP to find whether string is palindrome or not.
import java.util.*;
public class P2 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int strLength =str.length();
        String revString="";
        for(int i=strLength-1;i>=0;i--)
        {
            revString=revString+str.charAt(i);
        }
        if(str.toLowerCase().equals(revString.toLowerCase()))
        {
            System.out.println("The String is palindrome");
        }
        else
        {
            System.out.println("the String is not palindrome");
        }
    }
}
