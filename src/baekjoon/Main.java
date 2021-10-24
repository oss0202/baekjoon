package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split("");
        int sum = 0;
        for (String s : inputArr) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
   }
}
