public class String_pain{
    public static void main(String[] args) {
    int[] n={7,4,2};
    int count=0;
    int count1=0;
    String str="";
    int length=n.length;
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        // System.out.println(ones[2]);
        for(int i=0;i<length;i++)
        {
            if(n[i]<20)
            {
                str=str+ " "+ones[n[i]];

            }
            if(n[i]>=20 && n[i]<100)
            {
                str=str+" "+tens[n[i]/10] + ones[n[i]%10];
            }
        }
        // System.out.println(str);
        String[] str1=str.trim().split("\\s+");
        for(int i=0;i<str1.length;i++)
        {
           for(int j=0;j<str1[i].length();j++)
           {
                if(str1[i].charAt(j)=='a' ||str1[i].charAt(j)=='e' ||str1[i].charAt(j)=='i' || str1[i].charAt(j)=='o' || str1[i].charAt(j)=='u')
                {
                    count++;
                }
           }
        }
        System.out.println(count);
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                
                if(n[j]+n[i]==count)
                {
                    count1++;
                }
            }
        }
        System.out.println(count1);
    }
}