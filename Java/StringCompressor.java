public class StringCompressor {
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder comp = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                comp.append(str.charAt(i - 1));
                if (count > 1) {
                    comp.append(count);
                }
                count = 1;
            }
        }
        
        // Append the last character and its count if greater than 1
        comp.append(str.charAt(str.length() - 1));
        if (count > 1) {
            comp.append(count);
        }

        return comp.toString();
    }

    public static void main(String[] args) {
        String input = "AAACCCGGGT";
        String result = compress(input);
        System.out.println(result); // Output: A3C3G3T
    }
}
