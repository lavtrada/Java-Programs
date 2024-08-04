public class AddStrings {
    public static void main(String[] args) {
        String s1 = "13";
        String s2 = "232";
        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            int val1 = 0;
            int val2 = 0;

            if (n1 >= 0) {
                val1 = s1.charAt(n1) - '0';
                n1--;
            }

            if (n2 >= 0) {
                val2 = s2.charAt(n2) - '0';
                n2--;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }

        System.out.println(sb.reverse().toString());
    }
}
