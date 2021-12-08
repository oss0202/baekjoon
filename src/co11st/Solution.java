package co11st;

public class Solution {
    public static void main(String[] args) {
        int N = 1000;
        System.out.println(solution(N));
    }
    public static int solution(int N){
        // 1. 주어진 숫자의 합 구하기
        int sum = sumF(N);
        // 2. 주어진 숫자보다 크고 50,000보다 작은 숫자들 중에서 합이 같은 숫자 구하면 리턴
        for (int i = N+1; i <= 50000; i++) {
            int nowNum = i;
            int resultSum = 0;
            if(sum == sumF(i)){
                return i;
            }
        }
        return 0;
    }
    //  주어진 숫자의 합 구하기 함수
    private static int sumF(int N) {
        int sum = 0;
        while (N!=0){
            sum += N%10;
            N /= 10;
        }
        return sum;
    }
}
