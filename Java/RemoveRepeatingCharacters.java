public class RemoveRepeatingCharacters {

    public static void main(String[] args) {
        String input = "prominentpixel";
        String output = removeRepeatingCharacters(input);
        System.out.println("Output: " + output);
    }

    public static String removeRepeatingCharacters(String input) {
        // Create an array to count the frequency of each character
        int[] frequency = new int[256]; // ASCII characters range from 0 to 255

        // Count the frequency of each character
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        // Build the result string with characters that appear only once
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (frequency[input.charAt(i)] == 1) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}
