package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        1층 3호 -> 0층 1,2,3호까지의 사람 수 -> 1 + 2 + 3
        2층 3호 -> 1층 1,2,3호까지의 사람 수 -> 1 + 3 + 6

         */

        int[][] floors = new int[15][15];
        // 초기값 세팅 -> 0층 i호, i층 1호
        for (int i = 0; i < floors.length; i++) {
            floors[0][i] = i;

        }

   }
}
