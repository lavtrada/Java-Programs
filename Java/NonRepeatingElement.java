public class NonRepeatingElement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,1,3,3};
        boolean nonRepeatingFound=false;
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==x)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
                nonRepeatingFound=true;
            }
            
        }
        if (!nonRepeatingFound) {
            System.out.println("All the elements are repeating");
        }
        
    }
}
