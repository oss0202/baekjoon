package programmers;


public class Solution {
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
