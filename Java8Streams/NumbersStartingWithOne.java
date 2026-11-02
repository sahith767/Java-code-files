import java.util.Arrays;
import java.util.List;

public class NumbersStartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 21, 100, 145);

        list.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}