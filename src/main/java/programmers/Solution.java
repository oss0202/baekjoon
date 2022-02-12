package programmers;


public class Solution {
    public static void main(String[] args) {
        /**
         *  parameter : 기능진척도(progresses)배열, 속도(speeds)배열
         *  return : 각 배포별 배포되는 기능의 수
         *
         * 1. 기능과 속도배열에서 한개씩 인자 꺼내기
         * 2. 배포가능한 일자 구하기
         * - (100 - 기능진척도) / 속도
         * 3.
         * 4.
        */
//        int result = (100 - 93) / 1;

        int maxProgress = 100;
        int nowProgress = 30;
        int nowSpeed = 30;
        int mok = (maxProgress - nowProgress) / nowSpeed;
        int rest = (maxProgress - nowProgress) % nowSpeed;
        int result = 0;

        if(rest != 0){
            result = mok + 1;
        }
        System.out.println(result);
    }
}