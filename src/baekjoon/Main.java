package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];//알파벳 26자리
        String s = br.readLine();

        int UpperCnt = 0;
        int LowerCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if('A' <= chr && chr <= 'Z'){
                UpperCnt = chr - 65;
                arr[UpperCnt] += 1;
            }else {
                LowerCnt = chr - 97;
                arr[LowerCnt] += 1;
            }
        }
        int max = -1;
        char result = '?';

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                result = (char)(i + 65);//대문자로 출력
            }
            else if(arr[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
   }
}
