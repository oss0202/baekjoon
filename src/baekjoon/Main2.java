package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        /*
        In : Input 값
        nowCrossCnt : 현재 분수들 갯수
        preCrossCnt : 이전 분수들 갯수
        goal : 나와야 하는 분수


        1. 대각선 홀수
          In    nowCrossCnt     preCrossCnt     goal
          4     3               3               3/1
          5     3               3               2/2
          6     3               3               1/3

          분자 : In - (nowCrossCnt - preCrossCnt - 1)
          분모 : In - preCrossCnt
        2. 대각선 짝수
        반대로
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross_count = 1, prev_count_sum = 0;

        while (true) {

            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면
                    // 분자가 큰 수부터 시작
                    // 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 X 번째 - 직전 대각선까지의 누적합
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }

                else {	// 대각선의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
