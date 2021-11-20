package programmers;

public class Solution {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        /**
         * 명합지갑 만들기
         *
         * 1. 가로 길이가 세로 길이보다 길도록 배열 값 변경
         * 2. 가로, 세로 max값 구하기
         */
        int result = solution(sizes);
        System.out.println(result);

    }
    public static int solution(int[][] sizes) {
        int temp = 0;
        int maxH = 0;
        int maxW = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            maxH = Math.max(maxH, sizes[i][0]);
            maxW = Math.max(maxW, sizes[i][1]);
        }
        return maxW * maxH;
    }
}
