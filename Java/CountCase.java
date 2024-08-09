public class CountCase {

    public static void main(String[] args) {
        String input = "Hello World! This is a Test String with MIXED case.";
        int[] counts = countUppercaseAndLowercase(input);
        System.out.println("Uppercase Count: " + counts[0]);
        System.out.println("Lowercase Count: " + counts[1]);
    }

    public static int[] countUppercaseAndLowercase(String input) {
        // Initialize counters
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        // Return the counts in an array
        return new int[]{uppercaseCount, lowercaseCount};
    }
}
