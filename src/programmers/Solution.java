package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                result.add(arr[i]);
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }

        result.sort(Comparator.naturalOrder());
        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
//        int[] result = Arrays.stream(arr).filter(value -> value%divisor ==0).sorted().toArray();
        return finalResult;
    }
}
