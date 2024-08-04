
public class BinaryToDecimal {
    public static void main(String[] args) {
        String str = "1001";
        int count = str.length() - 1;
        int p = 0;
        int ans = 0;
        
        while(count >= 0) {
            ans += (str.charAt(count) - '0') * (int)(Math.pow(2, p));
            count--;
            p++;
        }
        
        System.out.println("Decimal representation: " + ans);
    }
}
