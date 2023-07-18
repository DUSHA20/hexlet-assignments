package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App implements KeyValueStorage {

    // Публичный статический метод для обмена ключей и значений в объекте базы данных
    public static void swapKeyValue(KeyValueStorage storage) {
        String[] keys = new String[storage.toMap().size()];
        String[] values = new String[storage.toMap().size()];
        int index = 0;

        // Сохраняем ключи и значения в отдельные массивы
        for (Entry<String, String> entry : storage.toMap().entrySet()) {
            keys[index] = entry.getKey();
            values[index] = entry.getValue();
            index++;
        }

        // Очищаем исходное хранилище и добавляем обмененные значения
        storage.clear();
        for (int i = 0; i < keys.length; i++) {
            storage.set(values[i], keys[i]);
        }
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
        return new HashMap<String, String>(database);
    }
}
// END
