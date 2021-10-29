package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        라인     배열 갯수
        1       1
        2       2
        3       3
        4       4
        5       5
         */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int inputNum = Integer.parseInt(br.readLine());
        // 입력받는 수
        int inputNum = 5;
        // 각 라인별 입력 받을 수 있는 수
        int lineNum = 1;
        // 각 라인별 합산
        int lineSum = 0;
        // 분자
        int numerator = 1;
        // 분모
        int denominator = 1;
        // 리턴 결과
        String result = numerator + "/" + denominator;

        int i = 1;
        int arrCnt = 1;
        if(inputNum != 1) {
            while (arrCnt <= inputNum) {
                lineNum++;

                //매 처음 시작 세팅(초기화)
                // 분자 = 1
                // 분모 = 라인 수
                numerator = lineNum;
                denominator = 1;
                lineSum = i + 2;
                for (int j = 1; j <= lineNum; j++) {
                    arrCnt++;
                    denominator = j;
                    numerator= lineSum - numerator;
                    result = numerator + "/" + denominator;
                }
                i++;
            }
        }
        System.out.println(result);
   }
}
