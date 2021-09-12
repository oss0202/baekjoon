package ip;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        int[] ints = main2.solution(7);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public int[] solution(int n){
        int[] answer = new int[2];
        //나머지 최소, 최대 변수
        int reMax = 0;
        int reMin = 0;

        int quotient = n/7;
        int remainder = n%7;

        //주 계산
        int weekCnt = quotient*2;

        //나머지
        if(remainder != 0) {
            if (remainder == 1) {
                reMax = 1;
                reMin = 1;
            } else {
                if (remainder < 7) {
                    reMin = 1;
                } else {
                    reMin = 2;
                }
                reMax = 2;
            }
        }
        answer[0] = (weekCnt + reMin);
        answer[1] = (weekCnt + reMax);
        return answer;
    }
}
