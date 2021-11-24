package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        String str = "abcdefg";
        System.out.println(str.startsWith("abc"));
        System.out.println(str.startsWith("abd"));
        System.out.println(str.startsWith("bcd"));
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
