package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        int selected = 3;
        int depth = 0;
        solution(ints, selected, depth, 0, "첫시작");
        System.out.println("-------------");
        System.out.println(results.size());
    }
    //배열에서 구할 수 있는 합, 차의 모든 경우의 수 삽입
    public static List results = new ArrayList();
    
    public static void solution(int[] arr, int selected, int depth, int nowNum, String call) {
        if(depth < arr.length-1){
//            System.out.println("-----------------------");
//            System.out.println("call -> " + call);
//            System.out.println("selected -> " + selected);
//            System.out.println("depth -> " + depth);
            selected++;
            depth++;
            solution(arr, selected, depth, nowNum + arr[depth], depth + "번째");
            solution(arr, selected, depth, nowNum - arr[depth], depth + "번째");
        }else{
            System.out.println(nowNum);
            results.add(nowNum);
        }
    }
}
