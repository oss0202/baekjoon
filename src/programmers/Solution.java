package programmers;

import java.util.Arrays;

public class Solution {
    public int solution(int left, int right) {
        //약수의 갯수
        int measure = 0;
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
