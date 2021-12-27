package algorithm.greedy;

import java.util.Arrays;

public class GymSuit {
    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2,4};
//        int[] reserve = {1,3,5};
        int[] reserve = {3};
    }
    public int solution(int n, int[] lost, int[] reserve) {
        /**
         * 1. 전체 학생수와 동일한 int배열만들기
         *  1) 체육복 상태는 0 / 1 / -1 이다.
         * 2. lost, reserve 처리
         *  1) lost에 해당하는 인덱스는 -1처리
         *  2) reserve에 해당하는 인덱스는 +1처리
         * 3. 빌리기
         *  1) 체육복이 없다면
         *      (1) 1번이 아니라면 앞에서 빌린 후 -1
         *      (2) 마지막이 아니라면 뒤에서 빌린 후 -1
         */

        /**
         * 1.
         */
        int[] children = new int[n];

        /**
         * 2. lost, reserve 처리
         */
        for (int i : lost) {
            children[i-1]--;
        }
        for (int i : reserve) {
            children[i-1]++;
        }

        /**
         * 3. 빌리기
         */
        for (int i = 0; i < children.length; i++) {
            if(children[i] < 0){
                if(i!=0 && children[i-1] > 0){
                    children[i]++;
                    children[i-1]--;
                }else if(i!=children.length-1 && children[i+1] > 0){
                    children[i]++;
                    children[i+1]--;
                }
            }
        }

        long result = Arrays.stream(children).filter(value -> value > -1).count();
        return (int) result;
    }
}
