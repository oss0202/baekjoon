package ip;

import java.util.*;
import java.util.stream.Collectors;

public class Main1_1 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(main1.solution(new int[]{2, 2, 1})));
//        System.out.println("for문 초기화 : " + Main1_1.solution(new int[]{3, 2, 2, 1}));
        System.out.println("for문 초기화 : " + Arrays.toString(Main1_1.solution(new int[]{3, 2, 1, 2})));
    }

    public static int[] solution(int[] grade) {
        int length = grade.length;
        int[] answer = new int[length];
        List<Integer> integers =
                Arrays
                        .stream(grade)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        int i = 0;
        for(int j : grade){
            answer[i] = integers.indexOf(j) + 1;
            i++;
        }

        return answer;
    }


}
