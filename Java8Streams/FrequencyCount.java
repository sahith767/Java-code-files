import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                1,2,3,2,1,4,3,2,5
        );

        Map<Integer, Long> map =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(map);
    }
}