package algorithm;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {
    public static final int n = 19;
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.hashCode());
        System.out.println(str.hashCode());

        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.hashCode());
        System.out.println(map.hashCode());

    }
}
