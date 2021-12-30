package programmers;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution(d,budget));
    }
    public static int solution(int[] d, int budget) {
        /**
         * 최대 몇개의 부서에 예산이 지원 가능한지 확인
         * 1. 오름차순으로 부서별 예산 정렬
         * 2. 부서별 예산 리스트 for문
         *  1) 남은 예산 - 부서예산이 0보다 클 경우
         *  - 예산 지급
         *  - 지급 숫자 count
         *  2) 나머지
         *  - 더이상 예산을 지급하지 못하므로 종료처리
         */
        int restBudget = 0;
        int budgetCnt = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            restBudget = budget - d[i];
            if(restBudget >= 0){
                budget = restBudget;
                budgetCnt++;
            }else{
                break;
            }
        }
        return budgetCnt;
    }
}
