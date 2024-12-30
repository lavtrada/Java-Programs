public class BinarySearch{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,45,50,80,90};
        int target=80;
        
        int left=0;
        int right=arr.length;
        int half=(left+right)/2;
            while(arr[half]!=target)
            {
                if(target>arr[half])
                {
                    left=half;
                    half=(left+right)/2;

                }
                if(target<arr[half])
                {
                    right=half;
                    half=(left+right)/2;
                }                
            }
            System.out.println(half);
        
    }
}