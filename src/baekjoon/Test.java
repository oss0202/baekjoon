package baekjoon;

import java.util.ArrayList;
import java.util.List;

public class Test {
    long sum(int[] a){
        long sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        String str = "aaabbbcdefg";
        char[] chars = str.toCharArray();
        boolean resultbool = true;
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i] > chars[i+1]){
                   resultbool = false;
            }
        }
        System.out.println(resultbool);
        // 숫자로 바꾼 후에 숫자가 이전 숫자보다 같거나 크지 않으면 그룹단어가 아니다.
//        System.out.println((int) a);
//        System.out.println((int) b);
    }
}
