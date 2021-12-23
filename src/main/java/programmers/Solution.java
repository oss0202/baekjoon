package programmers;

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {

        boolean result = true;

        Arrays.sort(phone_book);

        out:
        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                result = false;
                break out;
            }
        }

        return result;
    }
}
