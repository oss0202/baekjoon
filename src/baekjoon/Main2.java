package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        /*
        숫자 범위    방위 수      숫자 갯수
        1           1              1
        2 ~ 7       2              6
        8 ~ 19      3              12
        20 ~ 37     4              18
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        int N = 6;
        int cnt = 1;
        int multiplyNum = 2;
        if( N != 1 ){
            while(multiplyNum <= N){
                multiplyNum += cnt * 6;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
