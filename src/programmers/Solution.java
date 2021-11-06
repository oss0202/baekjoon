package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = "";

        Map<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() != 0){
                result = entry.getKey();
            }
        }
        System.out.println(result);
    }

    public static String solution(String[] participant, String[] completion) {
        String result = "";

        Map<String, Integer> map = new HashMap<>();
        // 참가자 인원 수(동명이인 포함)
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        // 완주자 제거
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // 미완주자 추출
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() != 0){
                result = entry.getKey();
            }
        }
        return result;
    }
}
