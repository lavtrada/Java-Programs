public class GeneticSequenceProcessor {
    public static String compress(String sequence) {
        if (sequence == null || sequence.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(sequence.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        compressed.append(sequence.charAt(sequence.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(compress("AAAAATTCCCGGGGAA")); // Output: A5T2C3G4A2
        System.out.println(compress("GGGGGGGGGGAAAAACCCTTTTTTT")); // Output: G10A5C3T7
        System.out.println(compress("ATCG")); // Output: ATCG

        // Edge cases
        System.out.println(compress("")); // Output: (empty string)
        System.out.println(compress("A")); // Output: A
        System.out.println(compress("AA")); // Output: A2
    }
}
