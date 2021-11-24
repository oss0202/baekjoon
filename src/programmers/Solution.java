package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    Set<Integer> numberSet = new HashSet<>();
    public void recursive(String comb, String others){
        // 1. 현재 조합(comb)을 set에 추가한다.
        numberSet.add(Integer.valueOf(comb));
        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.

    }

    public int solution(String numbers){
        // 1. 모든 숫자조합을 모두 만들어 준다.(재귀함수)
        recursive("", numbers);
        // 2. Set의 개념을 활용하여 중복되는 조합을 제거
        // 3. 소수인지 판단(에라토스채 - 루트값을 확인)
        return 123;
    }
}
