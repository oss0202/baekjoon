package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = solution(n, arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        int[] map = new int[n];
        String[] result = new String[n];

        // 1. 지도1(arr1), 지도2(arr2) or 연산
        for (int i = 0; i < map.length; i++) {
            map[i] = arr1[i]|arr2[i];
        }

        // 2. 자리수가 꽉 차지 않는다면 앞에 0 붙여주기
        for (int i = 0; i < map.length; i++) {
            String binaryResult = Integer.toBinaryString(map[i]);
            int cha = n - binaryResult.length();
            for (int j = 0; j < cha; j++) {
                binaryResult = "0" + binaryResult;
            }
            // 3. 1은 #으로, 0은 공백으로 치환
            binaryResult = binaryResult.replaceAll("1","#");
            binaryResult = binaryResult.replaceAll("0"," ");
            result[i] = binaryResult;
        }
        return result;
    }
}
