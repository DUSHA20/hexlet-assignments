package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> dictionary = new HashMap<>();
        String[] wordsFromSentence = sentence.split(" ");

        for (int i = 0; i < wordsFromSentence.length; i++) {
            int countOfCoincidences = 1;
            if (dictionary.containsKey(wordsFromSentence[i])) {
                countOfCoincidences = dictionary.get(wordsFromSentence[i]);
                countOfCoincidences++;
            }
            dictionary.put(wordsFromSentence[i], countOfCoincidences);
        }
        return dictionary;
    }

    public static String toString(Map<String, Integer> wordsFromDictionary) {
        if (wordsFromDictionary.isEmpty()) {
            return "{}";
        }
        String resultDictionary = "{\n";
        for (Map.Entry<String, Integer> word: wordsFromDictionary.entrySet()) {
            resultDictionary = resultDictionary + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        resultDictionary = resultDictionary + "}";
        return resultDictionary;
    }
}
//END
