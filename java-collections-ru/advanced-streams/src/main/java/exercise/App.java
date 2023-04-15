package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String environmentVariables) {
        char quotes = '"';
        String indexOfquotes = "";
        for (int i = 0; i < environmentVariables.length(); i++) {
            if (environmentVariables.charAt(i) == quotes) {
                indexOfquotes = indexOfquotes + i + " ";
            }
        }
        String resultLine = "";
        String wordsInQuotes = "";
        String[] arrayOfIndex = indexOfquotes.split(" ");
        for (int j = 0; j < arrayOfIndex.length - 1; j += 2) {
            wordsInQuotes = environmentVariables.substring(Integer.parseInt(arrayOfIndex[j]) + 1, Integer.parseInt(arrayOfIndex[j + 1]));
            String[] rightWords = wordsInQuotes.split(",");
            for (int k = 0; k < rightWords.length; k++) {
                if (rightWords[k].length() < 12)
                    continue;
                if((rightWords[k].substring(0,12)).equals("X_FORWARDED_")) {
                    resultLine = resultLine + rightWords[k].substring(12) + ",";
                }
            }
        }
        int endIndex = resultLine.length();
        String finalResult = resultLine.substring(0, endIndex - 1);
        return finalResult;
    }
}
//END
