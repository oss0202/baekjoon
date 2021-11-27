package co11st;

public class Solution1 {
    public static void main(String[] args) {
        int test1 = 28;
        int test2 = 734;
        int test3 = 1990;
        int test4 = 1000;
        System.out.println(solution(test1));
        System.out.println(solution(test2));
        System.out.println(solution(test3));
        System.out.println(solution(test4));
    }

    public static int solution(int N) {
        int sum = sumF(N);

        for(int i = N+1; i <= 50000; i++){
            int targetSum = sumF(i);
            if(sum == targetSum){
                return i;
            }
        }

        return 0;
    }

    public static int sumF(int N) {
        int sum = 0;
        while(N!=0){
            sum += N%10;
            N /= 10;
        }
        return sum;
    }
}
