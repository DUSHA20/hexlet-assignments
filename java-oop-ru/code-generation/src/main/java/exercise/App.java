package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;

public class App {
    public static void save(Path path, Car car) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonRepresentation = objectMapper.writeValueAsString(car);
            Files.write(path, jsonRepresentation.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car extract(Path path) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonRepresentation = new String(Files.readAllBytes(path));
            return objectMapper.readValue(jsonRepresentation, Car.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
// END
