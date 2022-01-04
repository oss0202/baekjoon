package old;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
        Stream<String> stream2 = list.stream();
        stream2.map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}