import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 22, 33, 44);

        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}