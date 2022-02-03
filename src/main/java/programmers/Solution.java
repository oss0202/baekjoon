package programmers;


public class Solution {
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    public static int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }

    public static void main(String[] args) {
        int[] ints = {1,1,1,1,1};
        int result = Solution.solution(ints, 3);
        System.out.println(result);
    }
}