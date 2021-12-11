package programmers;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            // 1.배열 자르기 시작 인덱스(n-1), 앞에서 자를 인덱스(n)
            int[] result = Arrays.copyOfRange(array, command[0]-1,command[1]);

            // 2. 정렬
            Arrays.sort(result);
            // 3. 숫자추출 (n-1)
            answer[index++] = result[command[2]-1];
        }
        return answer;
    }
}
