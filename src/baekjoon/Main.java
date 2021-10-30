package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*int H = 30;
        int W = 50;
        int N = 72;


        호수구하기
         앞에 수: N / H 의 나머지
         뒤에 수 : N / H 의 몫 + 1

         앞 : 4
         뒤 : 02

         H 30, W 50, N 60

         앞 : 30
         뒤 : 02
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int H = 0;
        int W = 0;
        int N = 0;

        int hun = 0;
        int one = 0;

        StringTokenizer st;
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            if ( N % H == 0){
                hun = H;
                one = N / H;
            }else{
                hun = N % H;
                one = (N/H)+1;
            }

            System.out.println(hun + String.format("%02d", one));
        }
   }
}
