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
        List<Map<String, String>> result = new ArrayList<>();

        for (int i = 0; i < sizeOfList; i++) {
            ArrayList<String> val1 = new ArrayList<>((books.get(i)).values());
            List<String> val2 = new ArrayList<>(where.values());
            int sizeOfListValues2 = val2.size();

            for (int n = 0; n < sizeOfListValues2; n++) {
                String currentValue2 = val2.get(n);
                if (val1.contains(currentValue2)) {
                    countOfConcidences++;
                }
            }

            if (countOfConcidences == sizeOfListValues2) {
                result.add(books.get(i));
            }
            countOfConcidences = 0;
        }

        if (result.isEmpty()) {
            return new ArrayList<>();
        } else {
            return result;
        }
    }
}
//END
