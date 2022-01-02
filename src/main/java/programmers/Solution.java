package programmers;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] participant  = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
    }
    public String solution(String[] participant, String[] completion) {
        /**
         * 1. participant를 key로 가지는 map만들기
         *  - value(default는 0) + 1
         * 2. completion를 순회하면서
         *  - participant에 있는 key값을 찾아서 value -1하기
         * 3. participant를(key, value모두 필요하니 entrySet) 순회하면서 value값이 0이 아닌 key return
         */
        String result = null;
        Map<String, Integer> pMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            pMap.put(participant[i], pMap.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            pMap.put(completion[i], pMap.getOrDefault(completion[i], 0) - 1);
        }

        Iterator<Map.Entry<String, Integer>> entryIterator = pMap.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            if(entry.getValue() != 0){
                result = entry.getKey();
//                System.out.println(entry.getKey());
            }
        }
        return result;
    }
}
