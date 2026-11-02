import java.util.Arrays;
import java.util.List;

public class CubeAndFilter {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(2,3,4,5);

        list.stream()
                .map(n -> n * n * n)
                .filter(n -> n > 50)
                .forEach(System.out::println);
    }
}