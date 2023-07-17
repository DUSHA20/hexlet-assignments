package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App implements Home {

    private double area;

    public double getArea() {
        return area;
    }

    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        return homes.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .limit(n)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
// END
