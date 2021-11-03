package programmers;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
//        int[] numbers = {5,8,4,0,6,7,9};
        Solution solution = new Solution();
        int result = solution.solution(numbers);
        System.out.println(result);
    }

    public int solution(int[] numbers) {
        int sum = 9*(1+9)/2;
        int result = Arrays.stream(numbers).sum();
        return sum - result;
    }
}
