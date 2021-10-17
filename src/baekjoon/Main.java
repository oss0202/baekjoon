package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxNum = 0;
        int indexNum = 0;
        for (int i = 0; i < 9; i++) {
            int val = Integer.parseInt(br.readLine());
            if(maxNum < val){
                maxNum = val;
                indexNum = i+ 1;
            }
        }
        System.out.println(maxNum);
        System.out.println(indexNum);
    }
}
