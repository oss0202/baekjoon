package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
//        String str = "aabbccddaa";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            if(check(str)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(String str){
        boolean[] booleans = new boolean[26];
        int prev = 0;
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            // 1. 이전 단어와 같다면
            if(now == prev){
                //      1) 그냥 진행
                continue;
                // 2. 이전 단어와 같지 않다면
            }else{
                //      1) 중복이 아니라면 배열 변경 및 이전값 세팅
                int nowIndex = now - 97;
                if(booleans[nowIndex] != true){
                    booleans[nowIndex] = true;
                    prev = now;
                    //      2) 중복이라면 false
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
