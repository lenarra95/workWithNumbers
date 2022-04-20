import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(number -> number > 0)
                .filter(number -> number % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}