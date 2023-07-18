package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App implements KeyValueStorage {

    public static void swapKeyValue(KeyValueStorage storage) {

        Map<String, String> database = storage.toMap();

        Map<String, String> swappedDatabase = new HashMap<>();

        for (Map.Entry<String, String> entry : database.entrySet()) {
            swappedDatabase.put(entry.getValue(), entry.getKey());
        }

        database.clear();
        database.putAll(swappedDatabase);
    }
}
// END
