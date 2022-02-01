package programmers;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /**
         * 1. 배열 자르기
         * 2. 배열 정렬하기
         * 3. n번째 숫자 뽑아내기
         */
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int[] result = Arrays.copyOfRange(array, command[0]-1, command[1]);

            Arrays.sort(result);
            answer[index++] = result[command[2]-1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
