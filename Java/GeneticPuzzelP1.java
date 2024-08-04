public class GeneticPuzzelP1 {

    public static String decompress(String comp) {
        if (comp == null || comp.isEmpty()) {
            return "";
        }
        
        // Use StringBuilder for string concatenation
        StringBuilder decomp = new StringBuilder();
        int length = comp.length();
        
        int i = 0;
        while (i < length) {
            // For Reading the character
            char currentChar = comp.charAt(i);
            i++;
            
            // If the character is present then it will read the count
            int count = 0;
            while (i < length && Character.isDigit(comp.charAt(i))) {
                count = count * 10 + (comp.charAt(i) - '0');
                i++;
            }
            
            // If count is 0 or not present, add the character once
            // Otherwise, add the character 'count' times
            if (count == 0) {
                decomp.append(currentChar);
            } else {
                for (int j = 0; j < count; j++) {
                    decomp.append(currentChar);
                }
            }
        }
        
        return decomp.toString();
    }
    public static String compress(String sequence) {
        if (sequence == null || sequence.isEmpty()) {
            return "";
        }

        // Use StringBuilder for string concatenation
        StringBuilder comp = new StringBuilder();
        int length = sequence.length();
        
        int i = 0;
        while (i < length) {
            // Read the current character
            char currentChar = sequence.charAt(i);
            int count = 1;
            i++;
            
            // Count consecutive characters
            while (i < length && sequence.charAt(i) == currentChar) {
                count++;
                i++;
            }
            
            // Append the character and its count if greater than 1
            comp.append(currentChar);
            if (count > 1) {
                comp.append(count);
            }
        }

        // Return the compressed string if it's shorter than the original
        return comp.length() < sequence.length() ? comp.toString() : sequence;
    }

    public static void main(String[] args) {
        

        // Decompression the String
        String comp1 = "A5T2C3G4A2";
        String comp2 = "G10A5C3T7";
        String comp3 = "ATCG";

        System.out.println("Decompress sequence for " + comp1 + ": " + decompress(comp1)); 
        // AAAAAATTCCCGGGGAA
        System.out.println("Decompress sequence for " + comp2 + ": " + decompress(comp2)); 
        // GGGGGGGGGGAAAAACCCTTTTTTT
        System.out.println("Decompress sequence for " + comp3 + ": " + decompress(comp3)); 
        // ATCG

        // Compression the String
        String sequence1 = "AAAAATTCCCGGGGAA";
        String sequence2 = "GGGGGGGGGGAAAAACCCTTTTTTT";
        String sequence3 = "ATCG";

        System.out.println("Compressed sequence for " + sequence1 + ": " + compress(sequence1)); 
        // A5T2C4G4A2
        System.out.println("Compressed sequence for " + sequence2 + ": " + compress(sequence2)); 
        // G10A5C3T7
        System.out.println("Compressed sequence for " + sequence3 + ": " + compress(sequence3)); 
        // ATCG
    }
}
