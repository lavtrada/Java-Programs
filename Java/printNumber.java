public class printNumber{
    static int N=1;
	public static void Number( ){
		if(N==11)
		{
            return;
		}
        else{
            System.out.println(N);
        }
        N++;
        Number();
	}
	public static void main(String[] args)
	{
		int N=10;
		Number();
	}
}