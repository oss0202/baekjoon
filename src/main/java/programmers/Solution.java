package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /**
         * 1. int 배열을 integer 리스트로 변환
         * 2. 두개씩 더했을 때 큰수가 되도록 내림차순 정렬
         * 3. 정렬된 숫자 합치기
         *  - 첫자리가 0이라면 0
         */
//        int[] numbers = {6, 10, 2};
        int[] numbers = {10, 6, 2};
//        System.out.println(Arrays.toString(numbers));
        /**
         * 2개씩 더했을 때 가장 큰 수가 되도록 내림차순 정렬
         */
        // int[] -> int stream -> integer stream -> string stream -> String[]
        String[] strings = Arrays.stream(numbers).boxed().map(String::valueOf).toArray(String[]::new);

        System.out.println(Arrays.toString(strings));

        String result = Arrays.stream(strings).reduce((s, s2) -> s+=s2).get();
        System.out.println(result);

/**
        // 첫번째와 두번째 비교
        String str1 = strings[0] + strings[1];
        String str2 = strings[1] + strings[0];

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        System.out.println("int1 = " + int1 + ", int2 = " + int2);

        String temp = "";
        // 둘중 큰 숫자인 것을 찾아서 순서 바꿔주기
        // 뒤에꺼가 크다면 순서 바꾸기
        // 앞에꺼가 크다면 기존 유지

        if(int1 < int2){
            temp = strings[0];
            strings[0] = strings[1];
            strings[1] = temp;
        }
        System.out.println(Arrays.toString(strings));

        // 첫번째와 세번째 비교
        str1 = strings[1] + strings[2];
        str2 = strings[2] + strings[1];
        int1 = Integer.parseInt(str1);
        int2 = Integer.parseInt(str2);

        if(int1 < int2){
            temp = strings[1];
            strings[1] = strings[2];
            strings[2] = temp;
        }
        System.out.println(Arrays.toString(strings));
*/
    }
    public String solution(int[] numbers) {
        String[] strings = Arrays.stream(numbers).boxed().map(String::valueOf).toArray(String[]::new);
        /**
         * 배열 돌면서 현재, 다음 원소의 숫자비교
         */
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String temp = "";
                String string1 = strings[i];
                String string2 = strings[j];

                String str1 = strings[i] + strings[j];
                String str2 = strings[j] + strings[i];

                int int1 = Integer.parseInt(str1);
                int int2 = Integer.parseInt(str2);

                if(int1 < int2){
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return Arrays.stream(strings).reduce((s, s2) -> s+=s2).get();
    }
}
