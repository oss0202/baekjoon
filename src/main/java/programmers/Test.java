package programmers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 200000; i++) {
            map.put(i,i);
        }
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("list - "+secDiffTime);

        beforeTime = System.currentTimeMillis();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 200000; i++) {
            integerList.add(i);
        }
        afterTime = System.currentTimeMillis();
        secDiffTime = (afterTime - beforeTime);
        System.out.println("map - "+secDiffTime);
    }
}
