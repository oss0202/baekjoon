package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        for (int i = 0; i < commands.length; i++) {
            int startNum = commands[i][0];
            int endNum = commands[i][1];
            int index = commands[i][2];

            System.out.println("startNum : " + startNum +", endNum : " + endNum + ", index : " + index);
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, startNum-1, endNum)));

            int[] resultInts = Arrays.copyOfRange(array, startNum-1, endNum);
            Arrays.sort(resultInts);
            System.out.println("result : " + resultInts[index-1]);
        }
    }
    public int[] solution(int[] array, int[][] commands) {
        
        return null;
    }
}
