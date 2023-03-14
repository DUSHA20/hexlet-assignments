package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map> findWhere(List<Map> books, Map<String, String> where) {
        int sizeOfList = books.size();
        int countOfConcidences = 0;
        List<Integer> matchIndices = new ArrayList<>(); // список индексов совпадений

        for (int i = 0; i < sizeOfList; i++) {
            List<String> val1 = new ArrayList<>((books.get(i)).values());
            List<String> val2 = new ArrayList<>(where.values());
            int sizeOfListValues2 = val2.size();

            for (int n = 0; n < sizeOfListValues2; n++) {
                String currentValue2 = val2.get(n);
                if (val1.contains(currentValue2)) {
                    countOfConcidences++;
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
