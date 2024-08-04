
public class ConvertToBinary {
    public static void main(String[] args) {
        String str = "";
        int n = 4;
        
        // Convert decimal to binary
        while(n > 0) {
            str = (n % 2) + str;
            n = n / 2;
        }
        
        System.out.println("Binary representation: " + str);
    }
}
