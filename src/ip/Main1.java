package ip;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        Main1 main = new Main1();
//        System.out.println(Arrays.toString(main1.solution(new int[]{2, 2, 1})));
        System.out.println("for문 초기화 : " + main1.solution(new int[]{2, 2, 1}));
        System.out.println("최초 초기화 한번(fill) : " + main1.solution2(new int[]{2, 2, 1}));


//        System.out.println(Arrays.toString(main1.solution(new int[]{4, 2, 1, 2})));
    }
    public long solution(int[] grade) {
        long beforeTime = System.nanoTime(); //코드 실행 전에 시간 받아오기
        int[] answer = new int[grade.length];
//        Arrays.fill(answer, 1);

        for (int i = 0; i < grade.length; i++) {
            int rank = 1;
//            answer[i] = 1;
            for (int j = 0; j < grade.length; j++) {
                if (grade[i] < grade[j]) {
//                    answer[i]++;
                    rank++;
                }
            }
            answer[i] = rank;
        }

        long afterTime = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산

//        return answer;
        return secDiffTime;
    }

    public long solution2(int[] grade) {
        long beforeTime = System.nanoTime(); //코드 실행 전에 시간 받아오기
        int[] answer = new int[grade.length];
        Arrays.fill(answer, 1);

        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length; j++) {
//                if(j == 0){
//                    answer[i] = 1;
//                }
                if (grade[i] < grade[j]) {
                    answer[i]++;
                }
            }
        }

        long afterTime = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산

//        return answer;
        return secDiffTime;
    }


}
