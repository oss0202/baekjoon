package programmers;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
    }
    public String solution(int[] numbers) {
        /**
         * 1. int 배열을 integer 리스트로 변환
         * 2. 두개씩 더했을 때 큰수가 되도록 내림차순 정렬
         * 3. 정렬된 숫자 합치기
         *  - 첫자리가 0이라면 0
         */
        List<Integer> integerList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        Collections.sort(integerList, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });

        StringBuilder sb = new StringBuilder();
        for (Integer i : integerList) {
            sb.append(i);
        }

        String answer = sb.toString();
        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }

}
