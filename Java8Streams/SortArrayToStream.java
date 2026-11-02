import java.util.Arrays;

public class SortArrayToStream {
    public static void main(String[] args) {

        int[] arr = {7,2,8,1,5};

        Arrays.sort(arr);

        Arrays.stream(arr)
                .forEach(System.out::println);
    }
}
