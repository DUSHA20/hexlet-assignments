package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public static boolean scrabble(String symbolsForWords, String word) {

        int stringLength = symbolsForWords.length();
        int wordLength = word.length();
        int coincidence = 0; // переменнная для проверки совпадения
        int numberOfCoincidences = 0;
        List<String> listOfLetters = new ArrayList<>();
        List<String> listOfLettersInWord = new ArrayList<>();
        for (int k = 0; k < stringLength; k++) {
             listOfLetters.add(String.valueOf(symbolsForWords.charAt(k)));
        }
        for (int m = 0; m < wordLength; m++) {
             listOfLettersInWord.add(String.valueOf(word.charAt(m)));
        }
        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j < stringLength; j++) {
                String currentLetterOfString = listOfLetters.get(j);
                String currentLetterOfWord = listOfLettersInWord.get(i);
                if (currentLetterOfString.equalsIgnoreCase(currentLetterOfWord)) {
                    listOfLetters.remove(j);
                    numberOfCoincidences++;
                    coincidence++;
                    break;
                }
            }
            if (coincidence == 0) {
                break;
            }
            coincidence--;
            stringLength = listOfLetters.size();
        }

        if (numberOfCoincidences == wordLength) {
            return true;
        } else {
           return false;
        }
}
//END
