package ip;

import java.util.*;
import java.util.stream.Collectors;

public class Main1_2 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(main1.solution(new int[]{2, 2, 1})));
//        System.out.println("for문 초기화 : " + Main1_1.solution(new int[]{3, 2, 2, 1}));
        System.out.println("for문 초기화 : " + Arrays.toString(Main1_2.solution(new int[]{1, 3, 1, 2})));
    }

    public static int[] solution(int[] grade) {
        int length = grade.length;
        Map<Integer, Integer> map = new HashMap<>();    // value, rank
        int[] copyed = Arrays.copyOf(grade, length);
        Arrays.sort(copyed);

        for (int value : copyed) {
            map.putIfAbsent(value, map.size());
        }

        for (int i = 0; i < length; i++) {
            copyed[i] = length - map.get(grade[i]) - 1;
        }

        return copyed;
    }


}
