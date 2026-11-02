import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalListCheck {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Spring","SQL");

        Optional.ofNullable(list)
                .filter(l -> !l.isEmpty())
                .ifPresent(l ->
                        l.forEach(System.out::println)
                );
    }
}