package programmers;

public class Solution {
    public static void main(String[] args) {
        //약수 출력하기
        int num = 14;
        // left ~ right 배열 만들기
        int left = 24;
        int right = 27;

        int result = solution(left, right);
        System.out.println(result);
    }

    public static int solution(int left, int right) {
        //약수의 갯수
        int measure;
        //최종 리턴값
        int reuslt = 0;
        for (int i = left; i <= right; i++) {
            measure = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    measure++;
                }
            }
            //짝수 : 더하기
            //홀수 : 빼기
            if(measure%2 == 0){
                reuslt+=i;
            }else{
                reuslt-=i;
            }
        }
        return reuslt;
    }
}
