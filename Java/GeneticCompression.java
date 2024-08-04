public class GeneticCompression {

    public static String decompress(String comp) {
        if (comp == null || comp.isEmpty()) {
            return "";
        }
        //Using StringBuilder
        StringBuilder decomp = new StringBuilder();
        int length = comp.length();
        
        for (int i = 0; i < length; ) {
            char currentChar = comp.charAt(i);
            i++;
            int count = 0;
            
            while (i < length && Character.isDigit(comp.charAt(i))) {
                count = count * 10 + (comp.charAt(i) - '0');
                i++;
            }
            
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

        StringBuilder comp = new StringBuilder();
        int length = sequence.length();
        
        for (int i = 0; i < length; ) {
            char currentChar = sequence.charAt(i);
            int count = 1;
            i++;
            
            while (i < length && sequence.charAt(i) == currentChar) {
                count++;
                i++;
            }
            
            comp.append(currentChar);
            if (count > 1) {
                comp.append(count);
            }
        }

        return comp.length() < sequence.length() ? comp.toString() : sequence;
    }

    public static void main(String[] args) {
        System.out.println("Remember, your code could be the key to unlocking groundbreaking discoveries in genetics. Good luck, and may your algorithm be as elegant as the double helix itself!");

        // Decompression test cases
        String comp1 = "A5T2C3G4A2";
        String comp2 = "G10A5C3T7";
        String comp3 = "ATCG";

        System.out.println("Decompress sequence for " + comp1 + ": " + decompress(comp1)); // AAAAAATTCCCGGGGAA
        System.out.println("Decompress sequence for " + comp2 + ": " + decompress(comp2)); // GGGGGGGGGGAAAAACCCTTTTTTT
        System.out.println("Decompress sequence for " + comp3 + ": " + decompress(comp3)); // ATCG

        // Compression test cases
        String sequence1 = "AAAAATTCCCGGGGAA";
        String sequence2 = "GGGGGGGGGGAAAAACCCTTTTTTT";
        String sequence3 = "ATCG";

        System.out.println("compressed sequence for " + sequence1 + ": " + compress(sequence1)); // A5T2C3G4A2
        System.out.println("compressed sequence for " + sequence2 + ": " + compress(sequence2)); // G10A5C3T7
        System.out.println("compressed sequence for " + sequence3 + ": " + compress(sequence3)); // ATCG
    }
}
