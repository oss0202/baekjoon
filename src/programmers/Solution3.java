package programmers;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = solution(participant, completion);
        System.out.println(result);
    }

    public static String solution(String[] participant, String[] completion) {
        // 완주자 for문
        for (int i = 0; i < completion.length; i++) {
            String s = completion[i];
            // 참가자 for문
            for (int j = 0; j < participant.length; j++) {
                // 참가자, 완주자가 같을 경우 ""로 치환
                if(completion[i].equals(participant[j])){
                    participant[j] = "";
                    break;
                }
            }
        }
        // ""이 아닌 참가자는 미완주자 이므로 출력
        String result = Arrays.stream(participant).filter(s -> !s.equals("")).findFirst().get();
        return result;
    }
}
