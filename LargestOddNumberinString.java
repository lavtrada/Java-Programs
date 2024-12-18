public class LargestOddNumberinString {
    public static void main(String[] args) {
        String num="53252";
        int length=num.length()-1;
        while(length>=0)
        {
            int d=num.charAt(length)-'0';
            if(d%2!=0)
            {
                System.out.println(num.substring(0, length+1));
            }
            length--;
        }
    }
}
