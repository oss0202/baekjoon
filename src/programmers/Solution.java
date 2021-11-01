package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //로또의 최고 순위와 최저 순위
//        int[] lottos = {44,1,0,0,31,25};
//        int[] win_nums ={31,109,45,1,6,19};
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums ={31, 10, 45, 1, 6, 19};
        Solution solution = new Solution();
        int[] result = solution.solution(lottos, win_nums);
        Arrays.stream(result).forEach(System.out::println);

    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int cnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i]==0){
                zeroCnt++;
            }else{
                for (int j = 0; j < win_nums.length; j++) {
                    if(win_nums[j] == lottos[i]) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        return new int[]{Math.min(7-(cnt+zeroCnt), 6) , Math.min(7 - cnt, 6)};
    }
}
