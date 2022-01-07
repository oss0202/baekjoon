package baekjoon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        /**
         * Q. String 문자열을 전달받으면 사칙연산을 진행하라
         *  - String s = "1+2+3*4"
         *  - 재귀함수( String 현재 s, int 가장 앞에있는 + or -, int 계산한 값)
         * 1. s의 문자열 길이 비교
         *  - 2이상일 경우 진행
         * 2. * 문자열 찾기
         */
        String parameter = "1+2+3+4";

        String[] strList = parameter.split("[^0-9]");
        System.out.println(Arrays.toString(strList));
        System.out.println(parameter.replaceAll("[^0-9]",""));
    }
}
