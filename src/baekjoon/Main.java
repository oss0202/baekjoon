package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        count   벌집  N최솟값
        1       1
        2       6     2
        3       12    8
        4       18    20
        5       24    38

        6의 배수에 따라서 들어가는 방의 수가 증가한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        int count = 1; // 겹 수(최소 루트)
        int range = 2; // 범위(최솟값 기준)
        // 6의 배수만큼 빼다가 0보다 작을 때 리턴
        if(inputNum != 1){
            while (range <= inputNum){
                range += ( 6 * count);
                count++;
            }
        }
        System.out.println(count);
   }
}
