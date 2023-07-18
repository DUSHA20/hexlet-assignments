package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App implements KeyValueStorage {

    public static void swapKeyValue(KeyValueStorage storage) {

        Map<String, String> database = storage.toMap();

        Map<String, String> swappedDatabase = new HashMap<String, String>();

        for (Map.Entry<String, String> entry : database.entrySet()) {
            swappedDatabase.put(entry.getValue(), entry.getKey());
        }

        database.clear();
        database.putAll(swappedDatabase);

        @Override
        public void set(String key, String value) {

        }

        @Override
        public void unset(String key) {
        }

        @Override
        public String get(String key, String defaultValue) {
            return null;
        }

        @Override
        public Map<String, String> toMap() {
            return null;
        }
    }
}
// END
