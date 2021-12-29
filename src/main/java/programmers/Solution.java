package programmers;


import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        /*** PriorityQueue(내림차순정렬) */
        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.add(priorities[i]);
        }

        /**
         * PriorityQueue(내림차순정렬)를 순회하면서
         * 인쇄문서(priorities)와 비교하여 index 카운트
         * */
        out:
        while (!priorityQueue.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                /*** PriorityQueue와 같다면 카운트증가*/
                if(priorities[i] == priorityQueue.peek()){
                    /*** 마지막 for문일 경우 그대로 return */
                    if(i == location){
                        answer++;
                        break out;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        if(priorityQueue.isEmpty()){
            answer = -1;
        }
        return answer;
    }
}
