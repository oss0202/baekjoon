package programmers;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        int[] numbers = {2,1,3,4,1};
        int[] numbers = {5,0,2,7};
        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers) {
        //중복을 제거하기 위해서 HashSet 자료구조 사용
        Set<Integer> integerSet = new HashSet<>();

        //2수를 선택해야한다.
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                integerSet.add(numbers[i] + numbers[j]);
            }
        }
        return integerSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
