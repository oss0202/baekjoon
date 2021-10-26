package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자로 바꾼 후에 숫자가 이전 숫자보다 같거나 크지 않으면 그룹단어가 아니다.
        
        // 그룹 단어의 수
        int resultCnt = 0;
        char[] chars;
        
        // 입렫받는 단어의 수
        int reCnt = Integer.parseInt(br.readLine());
        String[] inputStrings = new String[reCnt];
        first:for (int i = 0; i < reCnt; i++) {
            inputStrings[i] = br.readLine();
            chars = inputStrings[i].toCharArray();
            second:for (int j = 0; j < chars.length-1; j++) {
                if(chars[j] > chars[j+1]){
                    resultCnt++;
                    break second;
                }
            }
        }
        System.out.println(reCnt - resultCnt);
   }
}
