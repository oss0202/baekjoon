package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondMy {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String notUseString = br.readLine();//왜 받는지 모르겠습니다.
//        String[] score = br.readLine().split(" ");
//
//        Set<String> sales = new HashSet<>();
//        for (int i = 0; i < score.length; i++) {
//            sales.add(score[i]);
//        }
//        System.out.println(sales.size());

        /*
        - 입력을 4, 2, 2, 3, 1 받았을 때
        1, 2, 2, 3, 4로 오름차순 정렬
        - for문 돌리면서 재귀함수 사용
        1 2 -> +1
        2 2 -> 값이 같으니까 다음 숫자로 비교
        2 3 -> +1
        2 4 -> +1
        */

        int[] input = {4, 2, 2, 1, 3};
        int[] results = new int[5];
        Arrays.sort(input);
        results[0] = input[0];
        int cnt = 0;
        for (int i = 1; i < input.length; i++) {
            if(input[i-1] < input[i]){

            }
        }
    }

}
