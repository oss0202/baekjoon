package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int copyCnt = Integer.parseInt(st.nextToken());
            char[] chars = st.nextToken().toCharArray();

            for (char aChar : chars) {
                for (int j = 0; j < copyCnt; j++) {
                    System.out.print(aChar);
                }
            }
            System.out.println();
        }
   }
}
