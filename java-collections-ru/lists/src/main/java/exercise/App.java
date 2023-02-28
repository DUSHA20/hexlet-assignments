package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbolsForWords, String word) {

        int stringLength = symbolsForWords.length();
        int wordLength = word.length();
        List<String> listOfLetters = new ArrayList<>();

        for (int k = 0; k < stringLength; k++) {
            listOfLetters.add((String.valueOf(symbolsForWords.charAt(k))).toLowerCase());
        }

        for (int i = 0; i < wordLength; i++) {
            String currentLetterOfWord = (String.valueOf(word.charAt(i))).toLowerCase();
            if (listOfLetters.indexOf(currentLetterOfWord) != -1) {
                listOfLetters.remove(currentLetterOfWord);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END

