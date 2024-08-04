public class ConcateElementOfArray {
    public static void main(String[] args) {
        // String str="My name is digvijay";
        // String[] str1= str.split("/");
        // String out="";
        // for(int i=0;i<str1.length;i++)
        // {
        //     out+=str1[i]+" ";
        // }

        String[] str={"my","name","is","lav"};
        String out="";
        for(String s:str)
        {
            out+=s+" ";
        }
        System.out.println(out);
    }
}
