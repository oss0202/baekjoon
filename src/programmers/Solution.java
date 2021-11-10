package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        int N = 5;
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 4;
        int[] stages = {4,4,4,4,4};
        int[] result = solution(N, stages);
        System.out.println(Arrays.toString(result));

    }
    public static int[] solution(int N, int[] stages) {
        // 각 스테이지별 인원 수 구하기(N+1은 마지막 스테이지 클리어한 사람)
        int[] stagePerson = new int[N];
        for (int i = 0; i < stages.length; i++) {
            if(stages[i] != N+1){
                stagePerson[stages[i]-1]++;
            }
        }
        // 실패율 list 생성
        List<Double> failRate = new ArrayList<>();
        // 인덱스계산을 위한 실패율 array 생성
        double[] failArray = new double[N];

        // 스테이지에 도달한 명 수
        double num = stages.length;
        // 다음 스테이지 인원 수
        double remain = 0;

        //failArray 배열 실패율
        for (int i = 0; i < stagePerson.length; i++) {
            remain = stagePerson[i];
            if(num == 0){
                failArray[i] = 0;
            }else{
                failArray[i] = stagePerson[i]/num;
                num = num - remain;
            }
            failRate.add(failArray[i]);
        }
        //내림차순 정렬
        Collections.sort(failRate, Collections.reverseOrder());

        //정렬된 실패율값과 stage값을 비교해서 같으면 인덱스 번호를 가져온다.
        int[] result = new int[N];

        //중복된 값이 있을 수 있으므로 꺼낸 인덱스의 값은 -1로 변환해준다.
        for (int i = 0; i < failRate.size(); i++) {
            for (int j = 0; j < failArray.length; j++) {
                if(failRate.get(i) == failArray[j]){
                    result[i] = j+1;
                    failArray[j] = -1;
                    break;
                }
            }
        }
        return result;
    }
}
