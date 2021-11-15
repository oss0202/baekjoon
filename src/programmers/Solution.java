package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] d = {1,3,2,5,4};
//        int budget = 9;

        int[] d = {2,2,3,3};
        int budget = 10;
        int result = solution(d, budget);
        System.out.println(result);

    }

    public static int solution(int[] d, int budget) {
        int supportCnt = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(budget - d[i] >= 0){
                budget = budget- d[i];
                supportCnt++;
            }else{
                break;
            }
        }
        return supportCnt;
    }
}
