package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};

        // 문자열 스프림 배열 생성
        String[] strings = new String[numbers.length];

        // int배열 String배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        // 내림차순 정렬
        Arrays.sort(strings, (a, b) -> {
            return (a+b).compareTo(b+a);
            //오름차순 정렬
        });

        System.out.println(Arrays.toString(strings));

    }
}
