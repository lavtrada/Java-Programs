import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str ="Hello World";
        Stack<String> st=new Stack<>();
        String str1=" ";
       for(int i=0;i<str.length();i++)
       {
            if(str.charAt(i)==' ')
            {
                st.push(str1);
                str1="";
            }
            else
            {
                str1=str1+str.charAt(i);
            }
       }
       st.push(str1);
       System.out.println(st);
       String ans="";
       while(st.size()!=1)
       {
        ans =ans+st.peek()+" ";
        st.pop();
       }
       ans=ans+st.peek();
       System.out.println(ans);
    }
}
