import java.util.HashMap;
import java.util.Map;

public class WeatherPatternAnalyzer2 {

    public static Map<String, Object> analyzeWeather(String weatherData) {
        if (weatherData == null || weatherData.isEmpty()) {
            Map<String, Object> result = new HashMap<>();
            result.put("weatherCounts", "No data");
            result.put("longestStreak", "No data");
            return result;
        }

        // Map to store the count of each weather condition
        Map<Character, Integer> weatherCounts = new HashMap<>();
        // Variables to track the longest streak and the weather condition associated with it
        char longestStreakWeather = weatherData.charAt(0);
        int longestStreak = 0;
        int currentStreak = 1;

        // Initialize weather counts for each weather condition
        for (char condition : "SRCFH".toCharArray()) {
            weatherCounts.put(condition, 0);
        }

        // Count occurrences of the first weather condition
        weatherCounts.put(weatherData.charAt(0), 1);

        // Iterate through the weather data to count occurrences and find the longest streak
        for (int i = 1; i < weatherData.length(); i++) {
            char weather = weatherData.charAt(i);
            // Increment the count for the current weather condition
            weatherCounts.put(weather, weatherCounts.get(weather) + 1);

            // Check if the current weather is the same as the previous one
            if (weather == weatherData.charAt(i - 1)) {
                currentStreak++; // Increment the current streak length
            } else {
                // Update the longest streak if the current streak is longer
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                    longestStreakWeather = weatherData.charAt(i - 1);
                }
                // Reset the current streak length
                currentStreak = 1;
            }
        }

        // Final check for the last streak
        if (currentStreak > longestStreak) {
            longestStreak = currentStreak;
            longestStreakWeather = weatherData.charAt(weatherData.length() - 1);
        }

        // Prepare the result map with formatted weather counts and longest streak description
        Map<String, Object> result = new HashMap<>();
        result.put("weatherCounts", formatWeatherCounts(weatherCounts));
        result.put("longestStreak", longestStreak + " days of " + weatherDescription(longestStreakWeather) + " weather");

        return result;
    }
    private static String formatWeatherCounts(Map<Character, Integer> weatherCounts) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : weatherCounts.entrySet()) {
            char weather = entry.getKey();
            int count = entry.getValue();
            if (count > 0) {
                // It will Append the weather description and its count to the result string
                sb.append(weatherDescription(weather)).append(": ").append(count).append(" ");
            }
        }
        return sb.toString().trim(); // Remove trail space
    }

  
    private static String weatherDescription(char weather) {
        switch (weather) {
            case 'S': return "Sunny";
            case 'R': return "Rainy";
            case 'C': return "Cloudy";
            case 'H': return "Hazy";
            default: return "Unknown";
        }
    }

    public static void main(String[] args) {
        // Test cases for different weather data
        String weatherData1 = "SSSRRCCRSSSCCCRRH";
        String weatherData2 = "SSSSSCCCHHHHHHRRRRRR";
        String weatherData3 = "RRRRRCCCCCCSSSSH";

        // Output the analysis results for each test case
        System.out.println("Analysis data: " + weatherData1);
        System.out.println(analyzeWeather(weatherData1));
        System.out.println("Analysis data: " + weatherData2);
        System.out.println(analyzeWeather(weatherData2));
        System.out.println("Analysis data: " + weatherData3);
        System.out.println(analyzeWeather(weatherData3));

        // Edge cases
        String weatherData4 = "";
        System.out.println("Analysis data: " + weatherData4);
        System.out.println(analyzeWeather(weatherData4));

        String weatherData5 = "S";
        System.out.println("Analysis data: " + weatherData5);
        System.out.println(analyzeWeather(weatherData5));
    }
}
