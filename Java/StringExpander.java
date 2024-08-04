public class StringExpander {
    public static String expand(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder expanded = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            
            // Check if the current character is a letter
            if (Character.isLetter(currentChar)) {
                // Initialize a count variable to store the number following the letter
                int count = 0;
                int j = i + 1;
                
                // Loop to handle multiple digit numbers
                while (j < length && Character.isDigit(str.charAt(j))) {
                    count = count * 10 + (str.charAt(j) - '0');
                    j++;
                }
                
                // If no digits were found, the count is 1
                if (count == 0) {
                    count = 1;
                }
                
                // Append the currentChar 'count' times to the expanded string
                for (int k = 0; k < count; k++) {
                    expanded.append(currentChar);
                }
                
                // Move the index to the last digit of the current number
                i = j - 1;
            }
        }

        return expanded.toString();
    }

    public static void main(String[] args) {
        String input = "A5T2C3G4";
        String result = expand(input);
        System.out.println(result); // Output: AAAAAATTCCCGGGG
    }
}
