package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int[] scores = new int[caseNum];

        for (int i = 0; i < caseNum; i++) {
            int collectScore = 0;
            int collectSum = 0;
            char[] inputAns = br.readLine().toCharArray();
            for (char inputAn : inputAns) {
                if(inputAn == 'O') {
                    collectScore++;
                    collectSum += collectScore;
                }else{
                    collectScore = 0;
                }
            }
            scores[i] = collectSum;
        }

        for (int score : scores) {
            System.out.println(score);
        }
    }
}
