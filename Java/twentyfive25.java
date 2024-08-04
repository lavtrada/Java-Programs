class NumberToWords {
    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
                                           "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", 
                                          "ninety"};
    private static final String[] thousands = {"", "thousand", "million", "billion", "trillion"};
    
    public static void main(String[] args) {
        int number = 29;
        String result = convertNumberToWords(number);
        System.out.println("Output: " + result);
    }
    
    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWords(-number);
        }

        return convert(number).trim();
    }

    private static String convert(int number) {
        if (number < 10) {
            return units[number];
        }

        if (number < 20) {
            return teens[number - 10];
        }

        if (number < 100) {
            int tensDigit = number / 10;
            int unitsDigit = number % 10;
            return tens[tensDigit] + (unitsDigit > 0 ? " " + units[unitsDigit] : "");
        }

        if (number < 1000) {
            int hundredsDigit = number / 100;
            int remainder = number % 100;
            return units[hundredsDigit] + " hundred" + (remainder > 0 ? " and " + convert(remainder) : "");
        }

        for (int i = 0; i < thousands.length; i++) {
            int unitValue = (int) Math.pow(1000, i);
            int nextUnitValue = (int) Math.pow(1000, i + 1);

            if (number < nextUnitValue) {
                return convert(number / unitValue) + " " + thousands[i] + 
                       (number % unitValue > 0 ? " " + convert(number % unitValue) : "");
            }
        }

        return "";
    }
}
