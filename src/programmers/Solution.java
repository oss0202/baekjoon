package programmers;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";
        //짝수와 홀수인 경우로 나누어서 정리한다! 짝수면 2글자가 나오고 홀수면 1글자가 나올 것이다.
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }


    }

    public String solution(String s) {
        String answer = "";
        //짝수와 홀수인 경우로 나누어서 정리한다! 짝수면 2글자가 나오고 홀수면 1글자가 나올 것이다.
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return answer;
    }
}
