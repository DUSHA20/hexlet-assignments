package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long result = 0;
        result = emails.stream()
                .filter(email -> email.contains("@gmail.com"))
                .count();
        result = result + emails.stream()
                .filter(email -> email.contains("@yandex.ru"))
                .count();
        result = result + emails.stream()
                .filter(email -> email.contains("@hotmail.com"))
                .count();

        return result;
    }
}
// END
