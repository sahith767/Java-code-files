import java.util.Arrays;
import java.util.List;

public class MaximumValue {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10,50,20,99,31);

        int max =
                list.stream()
                        .max(Integer::compare)
                        .get();

        System.out.println(max);
    }
}