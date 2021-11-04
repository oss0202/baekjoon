package programmers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("첫번째", 1);
        map.put("두번째", 2);
        map.put("세번째", 3);
        map.put("네번째", 4);
        map.put("다섯번째", 5);
        map.put("다섯번째", 5);

        Set<Map.Entry<String, Integer>> strings = map.entrySet();
        strings.stream().forEach(stringIntegerEntry -> {
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        });

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> key = iterator.next();
            System.out.println(key);
        }
    }
}
