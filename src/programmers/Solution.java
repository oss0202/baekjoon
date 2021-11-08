package programmers;

public class Solution {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){{
                System.out.println(i);
            }}
        }
    }
    public static String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){{
                answer = "김서방은 " + i + "에 있다";
            }}
        }
        return answer;
    }
}
