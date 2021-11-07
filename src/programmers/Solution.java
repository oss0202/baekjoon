package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] result = solution(array, commands);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] array, int[][] commands) {
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
