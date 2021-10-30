package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int A = 100;
//        int B = 99;
//        int V = 1000000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        /*
        정상에서 미끄러 지지 않는다는 조건이 없다면,
         V / ( A - B )
         그러나 미끄러 지므로 A는 B보다 한상 1일 더 많아야 한다.
         */
        int day = (V - B) / (A - B);

        if((V - B) % (A - B) != 0){
            day++;
        }

        System.out.println(day);
   }
}
