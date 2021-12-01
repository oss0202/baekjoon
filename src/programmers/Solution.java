package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));


    }
    public static String solution(int[] numbers) {
        // 문자열 스프림 배열 생성
        String[] strings = new String[numbers.length];

        // int배열 String배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        // 내림차순 정렬
        Arrays.sort(strings, (a, b) -> {
            return (b+a).compareTo(a+b);
            //오름차순 정렬
        });
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
        }
        if(strings[0].equals("0")) result = "0";

        return result;
    }
}
