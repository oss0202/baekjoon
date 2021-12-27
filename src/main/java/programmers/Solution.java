package programmers;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        long result = 1234L;
//        System.out.println(result + "");
//
//        String resultStr = result + "";
//        for (int i = 0; i < resultStr.length(); i++) {
//            System.out.println(resultStr.charAt(i));
//        }
//
//        System.out.println("----------------");
//
//        int resultInt = (int) result;
//        while (resultInt > 0){
//            System.out.println(resultInt%10);
//            resultInt /= 10;
//        }
        System.out.println(Arrays.toString(solution(12345)));

    }
    public static int[] solution(long n) {
        /**
         * 1. 뒤에서부터 하나씩 빼오기
         * 2. while문 돌면서 변경된 사항 넣어주기
         */
        int resultInt = (int) n;
        int[] result = new int[(n+"").length()];
        int i = 0;
        while (resultInt > 0){
            result[i++] = resultInt%10;
            resultInt /= 10;
        }
        return result;


    }
}
