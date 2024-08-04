import java.util.HashMap;
import java.util.Map;

public class WeatherPatternAnalyzer {

    public static Map<Character, Integer> countWeatherConditions(String weatherData) {
        Map<Character, Integer> weatherCounts = new HashMap<>();
        for (char condition : weatherData.toCharArray()) {
            weatherCounts.put(condition, weatherCounts.getOrDefault(condition, 0) + 1);
        }
        return weatherCounts;
    }

    public static String findLongestStreak(String weatherData) {
        if (weatherData == null || weatherData.length() == 0) {
            return "No weather data available.";
        }

        char currentWeather = weatherData.charAt(0);
        int currentStreak = 1;
        char longestWeather = currentWeather;
        int longestStreak = 1;

        for (int i = 1; i < weatherData.length(); i++) {
            char weather = weatherData.charAt(i);
            if (weather == currentWeather) {
                currentStreak++;
            } else {
                currentWeather = weather;
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestWeather = currentWeather;
            }
        }

        return longestStreak + " days of " + getWeatherDescription(longestWeather) + " weather";
    }

    private static String getWeatherDescription(char weather) {
        switch (weather) {
            case 'S':
                return "Sunny";
            case 'R':
                return "Rainy";
            case 'C':
                return "Cloudy";
            case 'H':
                return "Hazy";
            default:
                return "Unknown";
        }
    }

    public static String findMostCommonThreeDayPattern(String weatherData) {
        if (weatherData == null || weatherData.length() < 3) {
            return "No sufficient weather data available.";
        }

        Map<String, Integer> patternCounts = new HashMap<>();
        for (int i = 0; i <= weatherData.length() - 3; i++) {
            String pattern = weatherData.substring(i, i + 3);
            patternCounts.put(pattern, patternCounts.getOrDefault(pattern, 0) + 1);
        }

        String mostCommonPattern = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : patternCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonPattern = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return "Most common three-day pattern: " + mostCommonPattern + " with " + maxCount + " occurrences";
    }

    public static void main(String[] args) {
        System.out.println("Remember, your code could be the key to unlocking groundbreaking discoveries in genetics. Good luck, and may your algorithm be as elegant as the double helix itself!");

        String weatherData = "SSSRRCCRSSSCCCRRH";
        
        // Count weather conditions
        Map<Character, Integer> weatherCounts = countWeatherConditions(weatherData);
        System.out.println("Weather Counts:");
        for (Map.Entry<Character, Integer> entry : weatherCounts.entrySet()) {
            System.out.println(getWeatherDescription(entry.getKey()) + ": " + entry.getValue());
        }

        // Find longest streak
        String longestStreak = findLongestStreak(weatherData);
        System.out.println("Longest Streak: " + longestStreak);

        // Find most common three-day pattern
        String commonPattern = findMostCommonThreeDayPattern(weatherData);
        System.out.println(commonPattern);

        // Test cases
        testCases();
    }

    private static void testCases() {
        String testData1 = "SSSRRCCRSSSCCCRRH";
        String testData2 = "SSSSSRRRRRCCCCCCHHHHH";
        String testData3 = "HCRSHCSHRSRHRHRSCH";

        System.out.println("\nTest Case Number 1:");
        analyzeWeather(testData1);

        System.out.println("\nTest Case Number 2:");
        analyzeWeather(testData2);

        System.out.println("\nTest Case Number 3:");
        analyzeWeather(testData3);

        System.out.println("\nEdge Case: Empty Data:");
        analyzeWeather("");

        System.out.println("\nEdge Case: Single Weather Condition:");
        analyzeWeather("SSSSSSS");
    }

    private static void analyzeWeather(String weatherData) {
        Map<Character, Integer> weatherCounts = countWeatherConditions(weatherData);
        System.out.println("Weather Counts:");
        for (Map.Entry<Character, Integer> entry : weatherCounts.entrySet()) {
            System.out.println(getWeatherDescription(entry.getKey()) + ": " + entry.getValue());
        }

        String longestStreak = findLongestStreak(weatherData);
        System.out.println("Longest Streak: " + longestStreak);

        String commonPattern = findMostCommonThreeDayPattern(weatherData);
        System.out.println(commonPattern);
    }
}