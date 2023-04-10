package exercise;

import java.util.Arrays;


// BEGIN
class App {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(Comparator.comparingLong(user -> LocalDate.parse(user.get("birthday")).toEpochDay()))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
