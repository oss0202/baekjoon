package programmers;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
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
