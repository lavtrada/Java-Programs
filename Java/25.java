// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class 25 {
     private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
                                           "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", 
                                          "ninety"};
    public static void main(String[] args) {
       
                                           int number = 119;
        String result = convertNumberToWords(number);
        System.out.println("Output: " + result);
        
    }
       public static String convertNumberToWords(int number) {
        if (number < 0 || number > 99) {
            return "Out of range";
        }

        if (number == 0) {
            return "zero";
        }

        if (number < 10) {
            return units[number];
        }

        if (number < 20) {
            return teens[number - 10];
        }

        // Handle numbers between 20 and 99
        int tensDigit = number / 10;
        int unitsDigit = number % 10;
        String result = tens[tensDigit];
        if (unitsDigit > 0) {
            result += " " + units[unitsDigit];
        }
        return result.trim();
    }
}