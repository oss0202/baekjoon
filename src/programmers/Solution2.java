package programmers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("17"));
    }

    public int solution(String numbers) {
        int count = 0;
        // 1. 재귀를 이용해서 모든 소수를 구한다.
        recursive("", numbers);
        System.out.println(set);

        // 2.소수인지를 판단한다.
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            if(isPrime(it.next())){
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(Integer next) {
        // 1. 0과 1일 경우에는 false
        if( next == 0 || next == 1){
            return false;
        }
        // 2. 에라토스테에스의 체를 이용해서 소수인지 확인하기
        int lim = (int) Math.sqrt(next);
        for (int i = 1; i < lim; i++) {
            if(next % lim == 0){
                return false;
            }
        }
        // 3. 나머지 경우에는 소수이다.
        return true;
    }

    Set<Integer> set = new HashSet<>();
    private void recursive(String comb, String others) {
        // 1. 처음 호출했을 경우를 제외하고 소수Set에 추가해준다.
        // -> 첫 호출은 comb가 비어있기 때문에
        if(!comb.equals("")){
            set.add(Integer.valueOf(comb));
        }

        // 2. 남은 숫자들을 이용해서 새로운 조합을 만든다.
        for(int i = 0; i < others.length(); i++){
            String inputOthers = others.substring(0, i) + others.substring(i+1);
            recursive(comb + others.charAt(i), inputOthers);
        }
    }
}
