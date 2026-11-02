import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ListToMapDuplicateKeys {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1,"John"),
                new Employee(2,"Mike"),
                new Employee(1,"David")
        );

        Map<Integer,String> map =
                list.stream()
                        .collect(Collectors.toMap(
                                e -> e.id,
                                e -> e.name,
                                (oldVal,newVal) -> oldVal,
                                TreeMap::new
                        ));

        System.out.println(map);
    }
}