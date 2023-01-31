package abstraction_basics_two.o;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of("$0","$1");
        list.forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
