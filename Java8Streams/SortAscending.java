import java.util.Arrays;
import java.util.List;

public class SortAscending {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(5,2,7,1,9);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}