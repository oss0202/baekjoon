import java.io.IOException;

public class Solution {
    int count = 0;
    public static void main(String[] args) throws IOException {
        int[] ints = {1,1,1,1,1};
        int target = 3;
        Solution solution = new Solution();
        int result = solution.solution(ints, target);
        System.out.println(result);
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        answer = this.count;
        return answer;
    }
    public void dfs(int[] numbers, int depth, int target, int result){
        if(depth == numbers.length){
            if(target == result){
                this.count++;
            }
            return;
        }
        int add = result + numbers[depth];
        int sub = result - numbers[depth];

        dfs(numbers, depth + 1, target, add);
        dfs(numbers, depth + 1, target, sub);
    }
}
