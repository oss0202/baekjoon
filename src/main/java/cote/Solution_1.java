package cote;

import java.util.regex.Pattern;

public class Solution_1 {
    String pattern1 = "^010-(?:\\d{3}|\\d{4})-\\d{4}$"; //유형 1
    String pattern2 = "^010(?:\\d{3}|\\d{4})\\d{4}$"; //유형 2
    String pattern3 = "^[+]82-10-\\d{4}-\\d{4}$"; //유형 3

    public static void main(String[] args) {
        String val = "+82-10-3434-2323";
        Solution_1 s = new Solution_1();
        System.out.println(s.solution(val));
    }
    public int solution(String phone_number) {
        int answer = -1;
        if(Pattern.matches(pattern1, phone_number)){
            answer = 1;
        }else if(Pattern.matches(pattern2, phone_number)){
            answer = 2;
        }else if(Pattern.matches(pattern3, phone_number)){
            answer = 3;
        }
        return answer;
    }
}
