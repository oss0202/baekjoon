package programmers;

public class Solution {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4};
//        int[] b = {-3,-1,0,2};
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        System.out.println(solution(a, b));

    }

    public static int solution(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}
