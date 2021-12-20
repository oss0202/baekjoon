package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("------------------------Token--------------------");
        StringTokenizer st = new StringTokenizer(str);
        for (String string : strings) {
            System.out.println(st.nextToken());
        }
    }
}
