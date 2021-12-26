package old.kamo;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        /**
         * 1. 이름에서 하이픈 제거
         * 2. 띄어쓰기로 split 후 배열의 크기비교
         *      1) 2이면 [0]의 첫글자
         *      2) 3이면 [0], [1] 의 첫글자
         * 3.
         */
//        String S = "John Doe, Peter Parker";
        String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Penny Parker";
        String C = "Example";


//        System.out.println(solution("John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker", "Example"));
        System.out.println(solution("Mary Jane Watson-Parker", "Example"));
    }

    public static String solution(String S, String C) {
        /**
         * 1. 이름에서 하이픈 제거
         * 2. 띄어쓰기로 split 후 배열의 크기비교
         *      1) 2이면 [0]의 첫글자
         *      2) 3이면 [0], [1] 의 첫글자
         * 3. HashMap에 현재 저장된 문자열 갯수 + 1
         *  1) 처음이 아닌 경우에만 숫자 붙여주기
         * 4. 형식에 맞게 리턴
         */
        String[] names = S.split(", ");
        Map<String , Integer> mailMap = new HashMap<>();
        String nowNm = "";
        String finalResult = "";
        int mailCnt = 0;
        String result = "";

        for (int i = 0; i < names.length; i++) {
            nowNm = "";
            nowNm = names[i].replaceAll("-","").toLowerCase();
            String[] name = nowNm.split(" ");
            int nameCnt = name.length;
            if(nameCnt > 2){
                if(name[2].length() > 8){
                    name[2] = name[2].substring(0,8);
                }
                nowNm = String.valueOf(name[0].charAt(0)) + (name[1].charAt(0)) + name[2];
            }else{
                nowNm = String.valueOf(name[0].charAt(0)) + name[1];
            }
            mailMap.put(nowNm,  mailMap.getOrDefault(nowNm, 0) + 1);
            mailCnt = mailMap.get(nowNm);
            finalResult = "";
            if(mailCnt != 1){
                finalResult = nowNm + mailCnt;
            }else{
                finalResult = nowNm;
            }

            if ( i!= 0 ){
                result += ", ";
            }
            result += names[i] + " <" + finalResult + "@" + C.toLowerCase() + ".com>";
        }
        return  result;
    }
}
