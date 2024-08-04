public class LongestPalindromString {
    public static void main(String[] args) {
        String s= "babad";
        String t="";
        String longestString="";
        int i=0,j=1;
        while(i<=j)
        {
            if(i==j)
            {
                System.out.println(s);
            }
            else
            {
                
                t=s.substring(i, j);
                String temp=t;
                StringBuilder sb= new StringBuilder(temp);
                sb.reverse().toString();
                if(sb.equals(t))
                {
                    longestString=t;
                }
                else
                {
                    j++;
                }
            }
            
        }
    }
}
