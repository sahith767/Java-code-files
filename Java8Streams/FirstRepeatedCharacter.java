import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "programming";

        Set<Character> set = new HashSet<>();

        Character ch = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> !set.add(c))
                .findFirst()
                .get();

        System.out.println(ch);
    }
}