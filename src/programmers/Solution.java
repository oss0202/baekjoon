package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.add(priorities[i]);
        }

        while (!priorityQueue.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == priorityQueue.peek()){
                    if(i == location){
                        answer++;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        if(priorityQueue.isEmpty()){
            answer = -1;
        }

        System.out.println(priorityQueue);
    }
}
