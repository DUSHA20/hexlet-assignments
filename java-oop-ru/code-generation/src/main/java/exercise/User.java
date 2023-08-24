package exercise;

import lombok.Value;

// BEGIN
import lombok.AllArgsConstructor;

@Value
@AllArgsConstructor
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
