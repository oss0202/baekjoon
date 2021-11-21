package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        String dartResult = "1S2D*3T";
//        String dartResult = "1T2D3D#";
        String dartResult = "1D2S3T*";
        System.out.println(solution(dartResult));

    }
    /**
     * ※ 총 3번 던질 수 있다.
     * 한사이클에서 입력받는 수 -> 점수|보너스|옵션
     * 1. 점수 : 0 ~ 10
     * 2. 보너스 : Single, Double, Triple
     * 3. 옵션  : 스타상(* : 이전점수, 현재점수 곱하기 2), 아차상(# : 현재점수 곱하기 -1)
     */
    public static int solution(String dartResult) {
        int[] scores = new int[3];
        int index = 0;
        char nowChar;
        int nowNum = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            nowChar = dartResult.charAt(i);
            /**
             * 숫자라면 점수
             * ※ 10점일 수도 있으므로 nowChar값이 1일 경우 다음값도 비교하여 배열에 넣어준다.(i값도 증가)
             */
            if (Character.isDigit(nowChar)) {
                nowNum = 0;
                // 10일 경우
                if (nowChar == '1' && dartResult.charAt(i + 1) == '0') {
                    nowNum = 10;
                    i++;//인덱스로 다음으로 증가
                } else {
                    nowNum = Character.getNumericValue(nowChar);
                }
                /**
                 * 이외의 문자라면 보너스거나 옵션이다.
                 */
            } else {
                switch (nowChar){
                    // 보너스 S, D, T
                    case 'S' :
                        scores[index++] = (int) Math.pow(nowNum, 1);
                        break;
                    case 'D' :
                        scores[index++] = (int) Math.pow(nowNum, 2);
                        break;
                    case 'T' :
                        scores[index++] = (int) Math.pow(nowNum, 3);
                        break;
                    // 옵션 스타상(*), 아차상(#)
                    case '*':
                        if(index > 1){
                            scores[index-2] *= 2;
                        }
                        scores[index-1] *= 2;
                        break;
                    case '#' :
                        scores[index-1] *= -1;
                        break;
                }
            }
        }
        return Arrays.stream(scores).sum();
    }
}
