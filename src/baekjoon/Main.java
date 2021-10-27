package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        A : 고정비용
        B : 가변비용

        ex. A : 1,000
            B : 70
            1대 생산 1070 : 1000 + 70
            10대 생산 1700 : 1000 + 700
            C : 가격
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int BEP = -1;
        if(C-B > 0){//손익분기점이 없는 경우 제외
            BEP = A/(C-B) + 1;
        }
        
        // 손익 분기점이 존재않는 경우
        System.out.println(BEP);
   }
}
