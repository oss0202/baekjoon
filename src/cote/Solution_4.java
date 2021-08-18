package cote;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution_4 {

    public static void main(String[] args) {
//        System.out.println((char)97);
//        System.out.println(result+1);
//        System.out.println((int)'a'-96);
//        System.out.println((int)key.charAt(1)-96);
//        System.out.println((int)key.charAt(2)-96);
//        System.out.println((int)key.charAt(3)-96);
        String encrypted_text = "hellopython";
        String key = "abcdefghijk";
        int rotation = 3;
        String[] encrypted_textStrings = encrypted_text.split("");
        char[] chars = key.toCharArray();
        int i = 0;
        // + Integer.parseInt(keyStrings[i])-96w
        String result1="";
        for (String str : encrypted_textStrings){
            // encrypted_text 문자 + key 문자 
            // char 변환
            System.out.println(str);
            System.out.println("-----");
            int sample = (int)(str.charAt(0))-96 + (int)chars[i]-96;
            int sample2 = (int)chars[i]-96;
            System.out.println(sample);
            System.out.println(sample2);
            System.out.println("-----");
            System.out.println((char)(sample+96));
            System.out.println((char)(sample2+96));
            System.out.println("-----");
            System.out.println(sample + sample2);
            System.out.println((char)(sample + sample2 + 96 + 96 ));
            System.out.println("");
            i++;
        }
//        System.out.println(result1);
        String result = String.join("", encrypted_textStrings);
//        System.out.println(result);
//        System.out.println(encrypted_text);


    }
    public String solution(String encrypted_text, String key, int rotation) {
        String answer = "";
        return answer;
    }
}
