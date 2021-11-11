package programmers;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = {3,1,2,3};
//        int[] nums = {3,3,3,2,2,4};
        int[] nums = {1,2,3,4,5,6};

    }

    public static int solution(int[] nums) {
        // 중복을 제거하고 전체/2 개수를 구할 수 있는 지 확인
        // Set으로 중복 제거
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result = 0;
        // Set의 길이가 전체/2보다 크다면 전체/2를
        // n * n-1 * n-2
        if(nums.length/2 < set.size()){
            result = nums.length/2;
        // Set의 길이가 전체/2보다 작다면 그데로 출력
        }else{
            result = set.size();
        }
        return result;
    }
}
