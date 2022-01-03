package programmers;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        /**
         * 1. 각 의상종류별 count하기
         *  -  HashMap을 이용
         *  - String(의상종류), Integer(숫자)
         * 3. 조합의 수 계산하기
         *  - HashMap에서 뒤에 숫자들 곱한 다음 -1
         *  - 모두 안입을 경우 빼주기
         *  - (n X n X n) -1
         */
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String[] clothe = clothes[i];
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> innerMap = entryIterator.next();
            answer *= (innerMap.getValue() +1 );
        }

        return answer-1;
    }
}
