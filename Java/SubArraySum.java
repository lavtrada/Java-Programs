public class SubArraySum {
        public static void main(String[] args) {
            int[] num={1,2,-1,2,1,1};
            int k=2;
            int count=0;
            for(int i=0;i<num.length;i++)
            {
                int sum=0;
                for(int j=i;j<num.length;j++)
                {
                    sum=sum+num[j];
                    if(sum==k) count++;
                }
            }
        System.out.println(count);
        }   
}
