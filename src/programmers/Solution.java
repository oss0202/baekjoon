package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "195524421"};
        boolean reuslt = true;

        // 1. HashMap을 만든다.
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i], 1);
        }
        // 2. 모든 전화번호의 접두어가 HashMap에 있는지 확인한다.
        out:
        for(int i = 0; i< phone_book.length; i++){
            for(int j = 1; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    reuslt = false;
                    break out;
                }
            }
        }

        // 3. 여기까지 왔다면 접두어가 없다는 것이다.
        System.out.println(reuslt);
    }

    public boolean solution(String[] phone_book) {
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();
        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);
        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++)
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
        return true;
    }

}
