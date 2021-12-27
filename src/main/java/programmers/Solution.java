package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        /**
         * 1. 배열의 길이가 1이면 -1 리턴
         * 2. 배열 돌면서 제일 작은 수 찾기
         * 3. 제일 작은 수 제외하고 배열 새로 만들기
         */
        if(arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(value -> value != min).toArray();
    }
}
