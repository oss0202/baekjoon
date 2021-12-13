package programmers;

import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {
        int cnt = 0;
        // 세수를 더했을 때 소수
        // 소수 = 본인보다 작은 수로 나누어 지지 않는 수
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(isPrime(num)){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return num>1;
    }
}
