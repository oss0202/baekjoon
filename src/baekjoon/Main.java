package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //숫자 입력
        int num = Integer.parseInt(br.readLine());

        // 한수함수 호출
        int result = arithmetic_sequence(num);
        System.out.println("result = " + result);


   }
    // 한수 : 등차수열을 이루는 수
    // 등차수열 공식 an = a1 + (n-1)d
    public static int arithmetic_sequence(int num){
        int cnt = 0;	// 한수 카운팅 변수

        if(num < 100){// 100보다 작을 경우 무조건 수열을 이룬다.
            return num;

        }else{// 100보다 클 경우
            cnt = 99;// 100보다 작을 경우 default 카운트
            if(num == 1000){ // 1000일 경우 999로 예외처리
                num = 999;
            }

            // 백, 십, 일의 자리 숫자 구하여 등차수열 비교
            for (int i = 100; i <= num; i++) {
                int hun = (i / 100) % 10;
                int ten = (i / 10) % 10;
                int one = i % 10;
                
                //백의자리 - 십의자리
                int firstDiff = hun - ten;
                //십의자리 - 일의자리
                int secondDiff = ten - one;

                // 각 자릿수의 차이가 같으면 등차수열을 이룬다.
                // 카운트
               if(firstDiff == secondDiff){
                   cnt++;
               }
            }
        }
        return cnt;
    }
}
