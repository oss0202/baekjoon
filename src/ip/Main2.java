package ip;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Main2 main2 = new Main2();
//        long[] ints = main2.solution((long)Math.pow(10,5));
        long[] ints = main2.solution(1);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public long[] solution(long n){
        long beforeTime = System.nanoTime(); //코드 실행 전에 시간 받아오기
        long[] answer = new long[2];
        //나머지 최소, 최대 변수
        long reMax = 0;
        long reMin = 0;

        long quotient = n/7;
        long remainder = n%7;

        //주 계산
        long weekCnt = quotient*2;

        //나머지
        if(remainder != 0) {
            if (remainder == 1) {
                reMax = 1;
            } else {
                reMax = 2;
            }
            if(remainder <= 5){
                reMin = 1;
            }else{
                reMin = 1;
            }
        }
        answer[0] = (weekCnt + reMin);
        answer[1] = (weekCnt + reMax);
        long afterTime = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산

        System.out.println("걸린 시간 : " + secDiffTime);
        return answer;
    }
}
