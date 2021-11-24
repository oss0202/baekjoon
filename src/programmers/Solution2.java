package programmers;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        boolean result = false;
        String[] phone_book = {"119", "97674223", "1195524421"};
    }

    public boolean solution(String[] phone_book) {
        boolean result = true;
        // 1. phone_book을 정렬한다.
        Arrays.sort(phone_book);

        // 2. 1중 loop를 돌면서 앞번호가 뒷번호와 접두어인지 확인한다.
        out:
        for(int i = 0; i < phone_book.length - 1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                result = false;
                break out;
            }
        }
        // 3. 여기까지 오지 못했다면 접두어가 없다는 것이다.
        return result;
    }
}
