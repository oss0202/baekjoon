package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int []arr) {
        List<Integer> result = new ArrayList();
        //배열 for문
        for (int i = 0; i < arr.length; i++) {
            //첫번째는 무조건 추가
            if(i==0){
                result.add(arr[i]);

                //이전 배열과 다르면 추가, 같으면 생략
            }else{
                if(arr[i] != arr[i-1]){
                    result.add(arr[i]);
                }
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
