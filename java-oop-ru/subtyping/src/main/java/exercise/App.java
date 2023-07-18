package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App implements KeyValueStorage {

    private Map<String, String> database;

    public App(Map<String, String> initialData) {
        this.database = new HashMap<>(initialData);
    }

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> database = storage.toMap();
        Map<String, String> swappedDatabase = new HashMap<>();

        for (Map.Entry<String, String> entry : database.entrySet()) {
            swappedDatabase.put(entry.getValue(), entry.getKey());
        }

        database.clear();
        database.putAll(swappedDatabase);
    }

    @Override
    public void set(String key, String value) {
        database.put(key, value);
    }

    @Override
    public void unset(String key) {
        database.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return database.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(database);
    }
}
// END
