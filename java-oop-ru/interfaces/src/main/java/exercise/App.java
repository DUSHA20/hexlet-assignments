package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public static class App implements Home {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        // Сортировка объектов по площади по возрастанию
        Collections.sort(homes, (home1, home2) -> Double.compare(home1.getArea(), home2.getArea()));

        // Получение первых n элементов
        List<Home> firstNHomes = homes.subList(0, n);

        // Создание списка строковых представлений объектов
        List<String> results = firstNHomes.stream().map(Home::toString).collect(Collectors.toList());

        return results;

    }
}
// END
