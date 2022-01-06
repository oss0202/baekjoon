package programmers;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /**
         * 1. 배열 자르기
         *  - Arrays.copyOfRange( 배열, 시작인덱스, 해당인덱스 앞에서 자름)
         *  - Arrays.copyOfRange( 배열, command -1, command)
         * 2. 배열 정렬하기
         *  - Arrays.sort( 배열 )
         * 3. 숫자 추출하기
         *  - 배열[인덱스]
         *  - 배열[command -1]
         */
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[] command = {2,5,3};

        int[] result = Arrays.copyOfRange(array, 2-1,5);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            /**
             * 1. 배열 자르기
             *  - Arrays.copyOfRange( 배열, 시작인덱스, 해당인덱스 앞에서 자름)
             *  - Arrays.copyOfRange( 배열, command -1, command)
             */
            int[] result = Arrays.copyOfRange(array, command[0]-1,command[1]);
             /** 2. 배열 정렬하기
             *  - Arrays.sort( 배열 )
             */
             Arrays.sort(result);

             /** 3. 숫자 추출하기
             *  - 배열[인덱스]
             *  - 배열[command -1]
             */
             answer[index++] = result[command[2]-1];
        }
        return answer;
    }
}
