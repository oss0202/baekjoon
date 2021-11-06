package programmers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);


//        System.out.println(integers.size());
//        System.out.println(integers.get(integers.size()-1));
        integers.remove(integers.size()-1);
        integers.stream().forEach(System.out::println);
    }
}
