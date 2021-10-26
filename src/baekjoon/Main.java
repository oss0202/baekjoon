package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
//        String str = "aabbccdd";//intput();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            // 현재 문자열 index값 저장
            int now = str.charAt(i);
            // 1.prev와 같다면 중복체크 X
            if(prev == now){
                continue;
            }
            // 2.prev와 다르다면 중복체크 O
            else{
                int charIndex = now - 97;
                if(check[charIndex] == false){
                    check[charIndex] = true;
                    prev = now;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int cnt = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < cnt; i++) {
            if(check()==true){
                count++;
            }
        }
        System.out.println(count);
   }
}
