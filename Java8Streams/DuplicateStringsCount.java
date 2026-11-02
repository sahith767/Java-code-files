import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringsCount {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java","Spring","Java",
                "SQL","Spring","Java"
        );

        Map<String, Long> result =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        result.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(System.out::println);
    }
}