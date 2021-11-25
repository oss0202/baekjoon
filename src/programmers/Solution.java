package programmers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    Set<Integer> numberSet = new HashSet<>();
    public void recursive(String comb, String others){
        // 1. 현재 조합(comb)을 set에 추가한다.
        if(!comb.equals("")){
            numberSet.add(Integer.valueOf(comb));
        }

        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for(int i = 0; i < others.length(); i++){
            // i번째를 제외하고 나머지 숫자를 다 전달한다.
            recursive(comb + others.charAt(i),
                    others.substring(0,i) + others.substring(i + 1));
        }
    }

    public int solution(String numbers){
        int count  = 0;
        // 1. 모든 숫자조합을 모두 만들어 준다.(재귀함수)
        recursive("", numbers);

        System.out.println(numberSet);
        // 2. 소수의 개수를 센다
        Iterator<Integer> it = numberSet.iterator();
        while (it.hasNext()){
            int number = it.next();
            if(isPrime(number)){
                count++;
            }
        }
        // 3. 소수의 개수를 반환한다.
        return count;
    }

    public boolean isPrime(int num) {
        // 1. 0과 1은 소수가 아니다.
        if(num == 0 || num == 1)
            return false;

        // 2. 에라토스테네스의 체의 limit을 계산한다.
        int lim = (int)Math.sqrt(num);

        // 3. 에라토스테네스의 체에 따라 limit까지만 배수 여부를 확인한다.
        for(int i = 2; i <= lim; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
