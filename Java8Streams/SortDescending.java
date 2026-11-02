import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(5,2,7,1,9);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}