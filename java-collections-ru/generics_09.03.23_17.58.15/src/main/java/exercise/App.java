package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        int sizeOfList = books.size();
        int countOfConcidences = 0;
        List<Integer> matchIndices = new ArrayList<>(); // список индексов совпадений

        for (int i = 0; i < sizeOfList; i++) {
            List<String> val1 = new ArrayList<>((books.get(i)).values());
            List<String> val2 = new ArrayList<>(where.values());

            int sizeOfListValues2 = 2;
            for (int n = 0; n < sizeOfListValues2; n++) {
                String currentValue1 = val1.get(n + 1); // текущее значение в первом словаре
                String currentValue2 = val2.get(n); // текущее значение во втором словаре

                if(currentValue1.equals(currentValue2)) {
                    countOfConcidences++;  // считаеется количесвто совпадений значений
                }
            }
            if (countOfConcidences != sizeOfListValues2) {
                matchIndices.add(i);
            }
            countOfConcidences = 0;
        }
        int sizeOfmatchIndices = matchIndices.size();
        for (int j = sizeOfmatchIndices - 1; j >= 0; j--) {
            int matchIndex = matchIndices.get(j);
            books.remove(matchIndex);
        }

        if (books.isEmpty()) {
            return new ArrayList<>();
        } else {
            return books;
        }
    }
}
//END
