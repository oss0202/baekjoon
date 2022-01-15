package old.gs;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        /**
         * 1. score 배열에서 앞 등수의 차이를 가지고 있는 diff 배열 생성
         * 2. 앞 등수와의 점수차이 갯수가 k이상인 점수 배열에 넣기
         *  - Map 에서 각 원소별 갯수 넣기
         * 3. diff 배열인덱스+1, +2 인덱스 diffSet에 넣기
         * 4. scroe 배열의 길이 - Set 컬랙션 길이
//         */
        int k = 3;
//        int k = 2;
        int[] score = {24, 22, 20, 10, 5, 3, 2, 1};
//        int[] score = {1300000000,700000000,668239490,618239490,568239490,568239486,518239486,157658638,157658634,100000000,100};

        int[] diff = new int[score.length-1];
        for (int i = 0; i < score.length-1; i++) {
            diff[i] = score[i] - score[i+1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < diff.length; i++) {
            map.put(diff[i], map.getOrDefault(diff[i], 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> entryIterator = map.entrySet().iterator();
        List<Integer> hackerList = new ArrayList<>();
        while (entryIterator.hasNext()){
            Map.Entry<Integer, Integer> entry = entryIterator.next();
            if(entry.getValue() >= k){
                hackerList.add(entry.getKey());
            }
        }

        Set<Integer> diffSet = new HashSet();
        for (int i = 0; i < diff.length; i++) {
            if(hackerList.contains(diff[i])){
                diffSet.add(i+1);
                diffSet.add(i+2);
            }
        }

        int result = (int) (score.length - diffSet.stream().count());

        System.out.println("정답 : " + result);
    }
}
