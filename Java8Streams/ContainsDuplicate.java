import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,1};

        boolean result =
                Arrays.stream(nums)
                        .boxed()
                        .allMatch(new HashSet<>()::add);

        System.out.println(!result);
    }
}