public class MoveZeros {
    public static void main(String[] args)
    {
        int[] arr={0,5,0,6,1};
        int i=0;
        int j=arr.length-1;
        while (i<j)
        {
            if(arr[i]==0 && arr[j]!=0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;            
            }
            else if(arr[i]!=0)
            {
                i++;
            }
            else {
                j--;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print("["+arr[i]+"]");
        }
    }
}
