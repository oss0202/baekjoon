package programmers;

import java.util.Arrays;

public class Solution {
    static int[] p1 = {1,2,3,4,5};
    static int[] p2 = {2,1,2,3,2,4,2,5};
    static int[] p3 = {3,3,1,1,2,2,4,4,5,5};

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        int[] result = solution(answers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] answers) {
        int[] score = new int[3];

        // 사람 별로 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == p1[i%5]) score[0]++;
            if(answers[i] == p2[i%8]) score[1]++;
            if(answers[i] == p3[i%10]) score[2]++;
        }
        // 가장 높은 점수 구하기
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if(score[i] > max){
                max = score[i];
            }
        }

        // 높은 점수 카운트
        int maxCnt = 0;
        for (int i = 0; i < 3; i++) {
            if(max == score[i]){
                maxCnt++;
            }
        }

        int[] result = new int[maxCnt];
        int index = 0;
        // 최고 높은 점수를 받은 사람 배열 생성
        for (int i = 0; i < 3; i++) {
            if(max == score[i]){
                result[index++] = i + 1;
            }
        }
        return result;
    }
}
